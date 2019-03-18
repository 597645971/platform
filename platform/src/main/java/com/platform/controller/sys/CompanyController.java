package com.platform.controller.sys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.model.filter.sys.CompanyFilter;
import com.platform.pager.Pager;
import com.platform.pager.ResponseMsg;
import com.platform.pager.ResponseMsg.ResponseRet;

@RestController
@RequestMapping("/company")
public class CompanyController {

	public ResponseMsg list(CompanyFilter filter, Pager pager) {
		Object object = null;
		return new ResponseMsg(ResponseRet.SUCCESS, "操作成功", object);
	}
}
