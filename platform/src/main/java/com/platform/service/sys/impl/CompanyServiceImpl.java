package com.platform.service.sys.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.platform.dao.sys.CompanyDao;
import com.platform.model.dto.sys.CompanyDTO;
import com.platform.model.entity.sys.Company;
import com.platform.model.filter.sys.CompanyFilter;
import com.platform.service.base.BaseServiceUtil;
import com.platform.service.sys.CompanyService;

@Service
@Transactional
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyDao companyDao;
	
	@Override
	public CompanyDTO getById(String id) {

		return companyDao.getById(id);
	}

	@Override
	public CompanyDTO getByCode(String code) {

		return companyDao.getByCode(code);
	}

	@Override
	public CompanyDTO getByName(String name) {

		return companyDao.getByName(name);
	}


	@Override
	public List<CompanyDTO> getCompanys(CompanyFilter filter) {

		return companyDao.getCompanys(filter);
	}

	@Override
	public void insert(Company company) {

		companyDao.insert(company);
	}

	@Override
	public void update(Company company) {

		companyDao.update(company);
	}

	@Override
	public void deleteById(String id) {

		companyDao.deleteById(id);
	}

	
	
}
