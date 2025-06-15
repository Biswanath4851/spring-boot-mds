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
        basePackages = "com.summerof2025.mds.spring_boot_mds.orderRepositoty",
        entityManagerFactoryRef = "postgreSqlEntityManagerFactoryBean",
        transactionManagerRef = "postgreSqlTransactionManager"
)
public class PostgreSqlJPAConfiguration {
    @Bean
    LocalContainerEntityManagerFactoryBean postgreSqlEntityManagerFactoryBean(EntityManagerFactoryBuilder entityManagerFactoryBuilder, @Qualifier("postgresSqlDataSource") DataSource dataSource) {
        return entityManagerFactoryBuilder
                .dataSource(dataSource)
                .packages("com.summerof2025.mds.spring_boot_mds.orderEntity")
                .build();

    }

    PlatformTransactionManager postgreSqlTransactionManager(
            @Qualifier("postgreSqlEntityManagerFactoryBean") LocalContainerEntityManagerFactoryBean postgreSqlEntityManagerFactoryBean) {
        return new org.springframework.orm.jpa.JpaTransactionManager(postgreSqlEntityManagerFactoryBean.getObject());
    }
}
