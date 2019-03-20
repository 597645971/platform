package com.platform.dao.sys;

import org.apache.ibatis.annotations.Param;

import com.platform.model.entity.sys.Role;
import com.platform.model.entity.sys.UserRole;

public interface RoleDao {

	
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
	void deleteUserRole(@Param("userId")String userId, @Param("roleId")String roleId);
}
