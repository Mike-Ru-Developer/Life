package com.education.life.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class DataBase {
    @Bean
    DataSource dataSource() {
	DriverManagerDataSource dataSource = new DriverManagerDataSource();
	dataSource.setUrl("jdbc:postgresql://localhost:5432/life");
	dataSource.setUsername("skif");
	dataSource.setPassword("skif");
	dataSource.setDriverClassName("org.postgresql.Driver");
	return dataSource;
    }
}
