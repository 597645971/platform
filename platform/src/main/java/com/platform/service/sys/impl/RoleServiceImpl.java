package com.platform.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platform.dao.sys.RoleDao;
import com.platform.model.entity.sys.Role;
import com.platform.model.entity.sys.UserRole;
import com.platform.service.sys.RoleService;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	@Override
	public void insertRole(Role role) {

		roleDao.insertRole(role);
	}

	@Override
	public void updateRole(Role role) {

		roleDao.updateRole(role);
	}

	@Override
	public void deleteRoleById(String id) {

		roleDao.deleteRoleById(id);
	}

	@Override
	public void insertUserRole(UserRole userRole) {

		roleDao.insertUserRole(userRole);
	}

	@Override
	public void deleteUserRole(String userId, String roleId) {

		roleDao.deleteUserRole(userId, roleId);
	}

}
