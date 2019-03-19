package com.platform.controller.sys;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.filter.sys.CompanyFilter;
import com.platform.pager.Pager;
import com.platform.pager.ResponseMsg;
import com.platform.pager.ResponseMsg.ResponseRet;
import com.platform.service.sys.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyController {

	@Autowired
	private CompanyService companyService;
	
	@GetMapping
	public ResponseMsg list(CompanyFilter filter, Pager pager) {
		Object object = null;
		companyService.getCompanys(filter);
		return new ResponseMsg(ResponseRet.SUCCESS, "操作成功", object);
	}
}
