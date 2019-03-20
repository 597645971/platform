package com.platform.utils.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.dozer.DozerBeanMapper;

public class BeanMapper {

	
	private static DozerBeanMapper dozer = new DozerBeanMapper();
	
	public static <T> T map(Object source, Class<T> destinationClass) {
		return dozer.map(source, destinationClass);
	}
	
	public static <T> List<T> mapList(Collection sourceList, Class<T> destinationClass){
		List<T> destinationList = new ArrayList<T>();
		for (Object sourceObject : sourceList) {
			T destinationObject = dozer.map(sourceObject, destinationClass);
			destinationList.add(destinationObject);
		}
		return destinationList;
	}
}
