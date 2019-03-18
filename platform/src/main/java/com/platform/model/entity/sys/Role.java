package com.platform.model.entity.sys;

import com.platform.model.entity.base.BasePOJO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class Role extends BasePOJO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String roleName;
	
	private String roleCode;
	
	private String roleDesc;
	
	private String companyId;


}
