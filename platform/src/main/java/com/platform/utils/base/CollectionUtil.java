package com.platform.utils.base;

import java.util.Collection;

import org.springframework.util.CollectionUtils;

public class CollectionUtil extends CollectionUtils {

	public static boolean isNotEmpty(Collection<?> col) {
		return !isEmpty(col);
	}
}
