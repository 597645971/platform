package com.platform.controller.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.platform.constant.ResponseConstant;
import com.platform.model.common.SystemException;
import com.platform.response.ResponseMsg;
import com.platform.response.ResponseMsg.ResponseCode;
import com.platform.utils.base.StringUtil;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ResponseBody
	@ExceptionHandler(SystemException.class)
	public ResponseMsg handSystemException(SystemException e) {
		return getReturnResponse(e, null);
	}
	
	@ResponseBody
	@ExceptionHandler(Exception.class)
	public ResponseMsg handException(Exception e) {
		
		return getReturnResponse(e, ResponseConstant.FAIL);
	}
	
	private ResponseMsg getReturnResponse(Throwable e, String errorMessage) {
		if(StringUtil.isEmpty(errorMessage)) {
			errorMessage = e.getMessage();
		}
		
		ResponseMsg resp = new ResponseMsg(ResponseCode.ERROR, errorMessage);
		return resp;
		
	}
}
