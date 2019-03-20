package com.platform.model.entity.sys;

import com.platform.model.entity.base.BasePOJO;

import lombok.Data;
import lombok.EqualsAndHashCode;


@Data
@EqualsAndHashCode(callSuper = true)
public class Company extends BasePOJO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;
	
	private String name;

	private String statusId;
}
