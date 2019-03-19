package com.platform.dao.interceptor;

import java.sql.Connection;
import java.util.Properties;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.mapping.SqlCommandType;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Plugin;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.reflection.DefaultReflectorFactory;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.springframework.stereotype.Component;

import com.platform.model.filter.base.BaseFilter;
import com.platform.utils.base.StringUtil;

@Intercepts({@Signature(type = StatementHandler.class, method = "prepare", args = {Connection.class, Integer.class})})
@Component
public class PageInterceptor implements Interceptor{

	
	@Override
	public Object intercept(Invocation invocation) throws Throwable {
		StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
		MetaObject metaObject = MetaObject.forObject(statementHandler, SystemMetaObject.DEFAULT_OBJECT_FACTORY, SystemMetaObject.DEFAULT_OBJECT_WRAPPER_FACTORY, new DefaultReflectorFactory());
		MappedStatement mappedStatement = (MappedStatement) metaObject.getValue("delegate.mappedStatement");
		SqlCommandType type = mappedStatement.getSqlCommandType();
		switch (type) {
			case INSERT:
			case UPDATE:
			case DELETE:
				break;
			case SELECT:
				BoundSql boundSql = statementHandler.getBoundSql();
				String sql = boundSql.getSql(); //获取SQL语句
				Object param = boundSql.getParameterObject(); //获取参数
				String packPath = mappedStatement.getId();
				if(param instanceof BaseFilter) {
					BaseFilter filter = (BaseFilter) param;
					if(StringUtil.isNotBlank(packPath) && packPath.toLowerCase().endsWith("count")) { //查询COUNT的语句跳过
						/**
						 * 定义约束：查询数量的SQL命名必须已XXXCount结尾
						 */
//						String countSql = createCountSql(sql);
//						metaObject.setValue("delegate.boundSql.sql", countSql);
						break;
					} 
					String pageSql =  createPageSqlOfMysql(filter, sql);
					metaObject.setValue("delegate.boundSql.sql", pageSql);
				}
			default:
				break;
		}
		return invocation.proceed();
	}

	@Override
	public Object plugin(Object target) {

		return Plugin.wrap(target, this);
	}

	@Override
	public void setProperties(Properties properties) {
		
	}
	
//	private String createCountSql(String sql) {
//		return "SELECT COUNT(1) FROM (" + sql + ") COUNT_T";
//	}
	
	private String createPageSqlOfMysql(BaseFilter filter,String sql) {
		Integer page = filter.getPage() < 1 ? 1 : filter.getPage();
		Integer rows = filter.getRows();
		String sidx = filter.getSidx();
		String sord = StringUtil.isBlank(filter.getSord()) ? "DESC" : filter.getSord();
		
		//计算limit的start
		Integer start = (page - 1) * rows;
		StringBuffer sqlBuffer = new StringBuffer();
		sqlBuffer.append("SELECT * FROM ( ").append(sql).append(" ) PAGE_T ");
		
		if(StringUtil.isNotBlank(sidx)) {
			sqlBuffer.append(" ORDER BY " + sidx + ",id " + sord);
		} else {
			sqlBuffer.append(" ORDER BY id DESC");
		}
		
		sqlBuffer.append(" LIMIT ").append( start + "," + rows);
		return sqlBuffer.toString();
	}

}
