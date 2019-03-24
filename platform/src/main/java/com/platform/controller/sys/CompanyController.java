package com.platform.controller.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.constant.response.ResponseConstant;
import com.platform.model.dto.sys.CompanyDTO;
import com.platform.model.entity.sys.Company;
import com.platform.model.filter.sys.CompanyFilter;
import com.platform.response.PageResponseMsg;
import com.platform.response.ResponseMsg;
import com.platform.response.ResponseMsg.ResponseCode;
import com.platform.service.sys.CompanyService;
import com.platform.utils.base.BatchUtil;
import com.platform.utils.bean.BeanMapper;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public PageResponseMsg list(CompanyFilter filter) {
		List<CompanyDTO> companys = companyService.getCompanys(filter);
		
		PageResponseMsg response = new PageResponseMsg(ResponseCode.SUCCESS, ResponseConstant.SUCCESS, filter);
		response.setData(companys);
		return response;
	}
	
	@PostMapping
	public ResponseMsg add(CompanyDTO companyDTO) {
		companyService.insert(BeanMapper.map(companyDTO, Company.class));
		
		return new ResponseMsg(ResponseCode.SUCCESS, ResponseConstant.SUCCESS);
	}
	
	@PutMapping
	public ResponseMsg update(CompanyDTO companyDTO) {
		companyService.update(BeanMapper.map(companyDTO, Company.class));
		
		return new ResponseMsg(ResponseCode.SUCCESS, ResponseConstant.SUCCESS);
	}
	
	@DeleteMapping
	public ResponseMsg delete(@RequestBody  String ids) {
		
		return new BatchUtil().batchDelete(id -> companyService.deleteById(id), ids);
		
	}
}
