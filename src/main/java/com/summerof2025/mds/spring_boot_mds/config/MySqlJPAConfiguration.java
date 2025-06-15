package com.summerof2025.mds.spring_boot_mds.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@EnableTransactionManagement
@Configuration
@EnableJpaRepositories (
        basePackages = "com.summerof2025.mds.spring_boot_mds.productRepositoty",
        entityManagerFactoryRef = "mySqlEntityManagerFactoryBean",
        transactionManagerRef = "mySqlTransactionManager"
)
public class MySqlJPAConfiguration {
    @Bean
    LocalContainerEntityManagerFactoryBean mySqlEntityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder, @Qualifier("mySqlDataSource") DataSource dataSource) {
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.summerof2025.mds.spring_boot_mds.productEntity")
                .build();

    }
    @Bean
    PlatformTransactionManager mySqlTransactionManager(
            @Qualifier("mySqlEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean mySqlEntityManagerFactoryBean) {
        return new org.springframework.orm.jpa.JpaTransactionManager(mySqlEntityManagerFactoryBean.getObject());
    }
}
