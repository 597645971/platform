package com.platform.dao.sys;

import java.util.List;

import com.platform.model.dto.sys.CompanyDTO;
import com.platform.model.entity.sys.Company;
import com.platform.model.filter.sys.CompanyFilter;

public interface CompanyDao {

	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	CompanyDTO getById(String id);
	
	/**
	 * 根据编码查询
	 * @param code
	 * @return
	 */
	CompanyDTO getByCode(String code);
	
	/**
	 * 根据名称查询
	 * @param name
	 * @return
	 */
	CompanyDTO getByName(String name);
	
	/**
	 * 查询公司数量
	 * @param filter
	 * @return
	 */
	int getCompanysCount(CompanyFilter filter);
	
	/**
	 * 查询公司列表
	 * @param filter
	 * @return
	 */
	List<CompanyDTO> getCompanys(CompanyFilter filter);
	
	/**
	 * 保存公司信息
	 * @param company
	 */
	void insert(Company company);
	
	/**
	 * 编辑公司信息
	 * @param company
	 */
	void update(Company company);
	
	/**
	 * 根据ID删除公司信息
	 * @param id
	 */
	void deleteById(String id);
}
