package com.summerof2025.mds.spring_boot_mds.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class PostgresSqlDataSourceConfiguration {
    @ConfigurationProperties("spring.datasource.postgressql")
    @Bean
    public DataSourceProperties postgresSqlDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    public DataSource postgresSqlDataSource(){
        return postgresSqlDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
