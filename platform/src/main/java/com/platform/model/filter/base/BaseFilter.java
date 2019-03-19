package com.platform.model.filter.base;

public class BaseFilter {

	public static final Integer MAX_ROWS = -1;
	/**
	 * 页码
	 */
	private Integer page = 1;
	
	/**
	 * 每页记录数
	 */
	private Integer rows = 20;
	
	/**
	 * 排序字段
	 */
	private String sidx;
	
	/**
	 * 排序方式 ASC/DESC
	 */
	private String sord;
	
	/**
	 * 总记录数
	 */
	private Integer records;
	
	/**
	 * 总页数
	 */
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

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
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
	
	
}
