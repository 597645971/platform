package com.platform.dao.sys;

import java.util.List;

import com.platform.model.entity.sys.User;

public interface UserDao {

	List<User> getUsers();
	
	void insert(User user);
	
	void update(User user);
	
	void deleteById(String id);
}
