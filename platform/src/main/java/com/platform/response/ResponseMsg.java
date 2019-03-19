package com.platform.response;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonView;

@JsonInclude(Include.NON_NULL)
public class ResponseMsg {

	public enum ResponseCode{
		SUCCESS("1"),ERROR("0"),NOTLOGIN("2");
		
		private String value;

		public String getValue() {
			return value;
		}

		private ResponseCode(String value) {
			this.value = value;
		}
	}
	
	private ResponseCode code;
	
	private String msg;
	
	private Object data = null;
	
	private List<Map<String, Object>> errList = null;

	public ResponseCode getCode() {
		return code;
	}

	public void setCode(ResponseCode code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@JsonView(BaseView.class)
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@JsonView(BaseView.class)
	public List<Map<String, Object>> getErrList() {
		return errList;
	}

	public void setErrList(List<Map<String, Object>> errList) {
		this.errList = errList;
	}

	public ResponseMsg(ResponseCode code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ResponseMsg(ResponseCode code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResponseMsg(ResponseCode code, String msg, List<Map<String, Object>> errList) {
		super();
		this.code = code;
		this.msg = msg;
		this.errList = errList;
	}

	
	
}
