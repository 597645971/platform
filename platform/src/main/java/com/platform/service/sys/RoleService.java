package com.platform.service.sys;

import com.platform.model.entity.sys.Role;
import com.platform.model.entity.sys.UserRole;

public interface RoleService {

	/**
	 * 新增角色
	 * @param role
	 */
	void insertRole(Role role);
	
	/**
	 * 修改角色
	 * @param role
	 */
	void updateRole(Role role);
	
	/**
	 * 根据ID删除角色
	 * @param id
	 */
	void deleteRoleById(String id);
	
	/**新增用户和角色的关系
	 * @param userRole
	 */
	void insertUserRole(UserRole userRole);
	
	/**
	 * 删除用户和角色的关系
	 * @param userId
	 * @param roleId
	 */
	void deleteUserRole(String userId, String roleId);
}
