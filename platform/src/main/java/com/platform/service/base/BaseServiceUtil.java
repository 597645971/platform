package com.platform.service.base;

import java.util.List;
import java.util.function.Function;

import com.platform.model.filter.base.BaseFilter;

public class BaseServiceUtil<R, F extends BaseFilter> {

	public List<R> list(Function<F, Integer> countAction, Function<F, List<R>> listAction, F filter){
		int count = countAction.apply(filter);
		if(BaseFilter.MAX_ROWS == filter.getRows()) { //如果rows = -1就查询所有
			filter.setRows(count);
		}
		filter.setRecords(count); //总记录数
		int total = count % filter.getRows();
		total = total > 0 ? total / filter.getRows() + 1 : total / filter.getRows();
		filter.setTotal(total); //总页数
		
		
		return listAction.apply(filter);
	}
	
	public static void main(String[] args) {
		//总记录数
		int count = 5;
		//每页数量
		int rows = 5; 
		//总记录数
		int total = count % rows > 0 ? count / rows + 1 : count / rows;
		System.out.println(total);
	}
}
