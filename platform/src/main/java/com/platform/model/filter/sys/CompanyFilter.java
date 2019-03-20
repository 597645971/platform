package com.platform.model.filter.sys;

import com.platform.model.filter.base.BaseFilter;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class CompanyFilter extends BaseFilter {

	private String code;
	
	private String name;
}
