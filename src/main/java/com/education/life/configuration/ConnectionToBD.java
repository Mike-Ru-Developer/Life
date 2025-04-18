package com.education.life.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConnectionToBD {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClassName;

    @Bean
    DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setUrl(url);
	dataSource.setUsername(username);
	dataSource.setPassword(password);
	dataSource.setDriverClassName(driverClassName);
	return dataSource;
    }
}