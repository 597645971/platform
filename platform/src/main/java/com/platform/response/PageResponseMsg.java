package com.platform.response;

import com.platform.model.filter.base.BaseFilter;

public class PageResponseMsg extends ResponseMsg {

	private Integer page;
	
	private Integer rows;
	
	private Integer records;
	
	private Integer total;

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public PageResponseMsg(ResponseCode code, String msg, BaseFilter filter) {
		super(code, msg);
		this.page = filter.getPage();
		this.rows = filter.getRows();
		this.records = filter.getRecords();
		this.total = filter.getTotal();
	}

	
	
	
	
}
