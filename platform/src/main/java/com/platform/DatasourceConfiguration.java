package com.platform;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
public class DatasourceConfiguration {

	@ConfigurationProperties(prefix="spring.datasource")
	@Bean
	public DruidDataSource mysqlSessionFactory() {
		return new DruidDataSource();
	}
}
