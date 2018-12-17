package com.lgj.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
public class SpringDAOConfig {
    @Bean("dataSource")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource source = new ComboPooledDataSource();
        source.setDriverClass("org.mariadb.jdbc.Driver");
        source.setJdbcUrl("jdbc:mariadb://localhost:3308/bookdb");
        source.setUser("root");
        source.setPassword("123456");

        return source;
    }

    @Bean("sqlSessionFactory")
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws PropertyVetoException {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(this.dataSource());
        factoryBean.setTypeAliasesPackage("com.lgj.entity");
        factoryBean.setConfigLocation(new ClassPathResource("mybatis-config.xml"));
        Resource[] resources = {
                new ClassPathResource("mappers/PAuthorMapper.xml"),
                new ClassPathResource("mappers/PPostMapper.xml")
        };
        factoryBean.setMapperLocations(resources);
        return factoryBean;
    }

    @Bean("mapperScannerConfigurer")
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer configurer = new MapperScannerConfigurer();
        configurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        configurer.setBasePackage("com.lgj.dao");
        return configurer;
    }

    @Bean("transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager() throws PropertyVetoException {
        DataSourceTransactionManager manager = new DataSourceTransactionManager();
        manager.setDataSource(this.dataSource());
        return manager;
    }

    @Bean
    public BeanDefinitionBuilder definitionBuilder(){
        return null;
    }
}
