package com.platform.controller.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class ViewConfiguration extends WebMvcConfigurationSupport {


	@Override
	protected void addInterceptors(InterceptorRegistry registry) {

		registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
	}
	
	

	
	
	
	/*
	 * WebMvcConfigurer config = new WebMvcConfigurer() {
	 * 
	 * @Override public void addViewControllers(ViewControllerRegistry registry) {
	 * registry.addViewController("/").setViewName("blog/index"); }
	 * 
	 * }; return config;
	 */
}
