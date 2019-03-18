package com.platform.model.entity.base;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BasePOJO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String id;
	
	private String status;
	
	private String createId;
	
	private Date createDate;
	
	private String updateId;
	
	private Date updateDate;

	
}
