package com.platform.pager;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Pager {

	private Integer page;
	
	private Integer rows;
	
	private Integer records;
	
	private Integer total;
}
