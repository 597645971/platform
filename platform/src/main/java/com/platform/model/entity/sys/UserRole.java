package com.platform.model.entity.sys;

import com.platform.model.entity.base.BasePOJO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserRole extends BasePOJO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private  String userId;
	
	private String roleId;
}
