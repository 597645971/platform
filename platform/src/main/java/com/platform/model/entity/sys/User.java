package com.platform.model.entity.sys;

import java.util.Date;

import com.platform.model.entity.base.BasePOJO;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class User extends BasePOJO {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
	
	private String password;
	
	private String personName;
	
	private String email;
	
	private String phone;
	
	private String address;
	
	private String userType;
	
	private Date regTime;
	
	private int comapnyId;

	private String statusId;
}
