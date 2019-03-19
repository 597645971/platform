package com.platform.model.dto.sys;

import com.platform.model.entity.sys.User;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String statusName;
	
	private String createName;
	
	private String updateName;

}
