package com.platform.pager;

import java.util.List;
import java.util.Map;

public class ResponseMsg extends Pager {

	public enum ResponseRet{
		SUCCESS("1"),ERROR("0"),NOLOGIN("1"),WARN("2");
		
		private String value;

		public String getValue() {
			return value;
		}

		private ResponseRet(String value) {
			this.value = value;
		}
		
	}
	
	protected ResponseRet code;
	
	protected String msg;
	
	protected Object data = null;
	
	protected List<Map<String, Object>> errList = null;

	public ResponseRet getCode() {
		return code;
	}

	public void setCode(ResponseRet code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public List<Map<String, Object>> getErrList() {
		return errList;
	}

	public void setErrList(List<Map<String, Object>> errList) {
		this.errList = errList;
	}

	public ResponseMsg(ResponseRet code, String msg) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public ResponseMsg(ResponseRet code, String msg, Object data) {
		super();
		this.code = code;
		this.msg = msg;
		this.data = data;
	}

	public ResponseMsg(ResponseRet code, String msg, List<Map<String, Object>> errList) {
		super();
		this.code = code;
		this.msg = msg;
		this.errList = errList;
	}
	
	
	
	
}
