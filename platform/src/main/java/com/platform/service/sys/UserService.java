package com.platform.service.sys;

import java.util.List;

import com.platform.model.entity.sys.User;

public interface UserService {

	List<User> getUsers();
	
	void insert(User user);
	
	void update(User user);
	
	void deleteById(String id);
}
