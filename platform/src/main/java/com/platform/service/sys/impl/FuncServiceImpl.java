package com.platform.service.sys.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platform.dao.sys.FuncDao;
import com.platform.model.entity.sys.Function;
import com.platform.model.entity.sys.FunctionRole;
import com.platform.service.sys.FuncService;

@Service
@Transactional
public class FuncServiceImpl implements FuncService {

	@Autowired
	private FuncDao funcDao;
	
	@Override
	public void insertFunc(Function function) {

		funcDao.insertFunc(function);
	}

	@Override
	public void updateFunc(Function function) {

		funcDao.updateFunc(function);
	}

	@Override
	public void deleteFuncById(String id) {

		funcDao.deleteFuncById(id);
	}

	@Override
	public void insertFuncRole(FunctionRole functionRole) {

		funcDao.insertFuncRole(functionRole);
	}

	@Override
	public void deleteFuncRole(String funcId, String roleId) {

		funcDao.deleteFuncRole(funcId, roleId);
	}

	
}
