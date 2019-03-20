package com.platform.controller.sys;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.constant.response.ResponseConstant;
import com.platform.model.dto.sys.CompanyDTO;
import com.platform.model.filter.base.BaseFilter;
import com.platform.model.filter.sys.CompanyFilter;
import com.platform.response.PageResponseMsg;
import com.platform.response.ResponseMsg.ResponseCode;
import com.platform.service.sys.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public PageResponseMsg list(CompanyFilter filter) {
		List<CompanyDTO> companys = companyService.getCompanys(filter);
		
		
		BaseFilter baseFilter = filter;
		PageResponseMsg response = new PageResponseMsg(ResponseCode.SUCCESS, ResponseConstant.SUCCESS, baseFilter);
		response.setData(companys);
		return response;
	}
}
