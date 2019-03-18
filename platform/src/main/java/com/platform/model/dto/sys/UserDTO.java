package com.platform.model.dto.sys;

import com.platform.model.entity.sys.User;

public class UserDTO extends User {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String statusName;
	
	private String createName;
	
	private String updateName;

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}
	
	
}
