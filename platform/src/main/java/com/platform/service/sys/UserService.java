package com.platform.service.sys;

import java.util.List;

import com.platform.model.entity.sys.User;
import com.platform.model.filter.sys.UserFilter;

public interface UserService {

	/**
	 * 查询用户
	 * @param filter
	 * @return
	 */
	List<User> getUsers(UserFilter filter);
	
	/**
	 * 新增用户
	 * @param user
	 */
	void insert(User user);
	
	/**
	 * 编辑用户
	 * @param user
	 */
	void update(User user);
	
	/**
	 * 根据ID删除用户
	 * @param id
	 */
	void deleteById(String id);
}
