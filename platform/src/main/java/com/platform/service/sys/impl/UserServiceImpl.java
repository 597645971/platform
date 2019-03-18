package com.platform.service.sys.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platform.dao.sys.UserDao;
import com.platform.model.entity.sys.User;
import com.platform.service.sys.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	public List<User> getUsers() {

		return userDao.getUsers();
	}

	public void insert(User user) {
		
		userDao.insert(user);
	}

	public void update(User user) {

		userDao.update(user);
	}

	public void deleteById(String id) {

		userDao.deleteById(id);
	}

	
}
