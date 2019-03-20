package com.platform.service.sys;

import com.platform.model.entity.sys.Function;
import com.platform.model.entity.sys.FunctionRole;

public interface FuncService {

	/**
	 * 新增菜单
	 * @param function
	 */
	void insertFunc(Function function);
	
	/**
	 * 编辑菜单
	 * @param function
	 */
	void updateFunc(Function function);
	
	/**
	 * 删除菜单
	 * @param id
	 */
	void deleteFuncById(String id);
	
	/**
	 * 新增菜单和权限的关系
	 * @param functionRole
	 */
	void insertFuncRole(FunctionRole functionRole);
	
	/**
	 * 删除菜单和权限的关系
	 * @param funcId
	 * @param roleId
	 */
	void deleteFuncRole(String funcId, String roleId);
}
