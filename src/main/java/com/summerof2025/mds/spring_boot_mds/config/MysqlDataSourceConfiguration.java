package com.summerof2025.mds.spring_boot_mds.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class MysqlDataSourceConfiguration {
    @ConfigurationProperties("spring.datasource.mysql")
    @Bean
    public DataSourceProperties mySqlDataSourceProperties(){
        return new DataSourceProperties();
    }

    @Bean
    @Primary
    public DataSource mySqlDataSource(){
        return mySqlDataSourceProperties().initializeDataSourceBuilder().build();
    }
}
