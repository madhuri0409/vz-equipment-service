package com.verizon.equipment.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatasourceConfig {

	@Value("${database.equipment.url}")
    private String databaseUrl;
 
    @Value("${database.equipment.driver}")
    private String driverClassName;
 
    @Value("${database.equipment.dialect}")
    private String dialect;
 
    @Value("${database.equipment.username}")
    private String username;
    
    @Value("${database.equipment.password}")
    private String password;
	
    @Bean
    public DataSource h2DataSource() 
    {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName(driverClassName);
        dataSourceBuilder.url(databaseUrl);
        dataSourceBuilder.username(username);
        dataSourceBuilder.password(password);
        return dataSourceBuilder.build();
    }
}
