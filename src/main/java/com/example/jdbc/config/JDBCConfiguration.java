package com.example.jdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * 指定加载哪个配置类
 */
@EnableConfigurationProperties(JDBCProperties.class)
@Configuration
/**
 * 加载指定的配置文件
 */
@PropertySource("classpath:/application.yml")
public class JDBCConfiguration {
//    @Value("${driver-class-name}")
//    private String driverClassName;
//    @Value("${url}")
//    private String url;
//    @Value("${data-username}")
//    private String username;
//    @Value("${data-password}")
//    private String password;

    @Autowired
    private JDBCProperties jdbcProperties;
    /**
     * 实例化druid
     */
    @Bean
    public DataSource getDataSource(){
        DruidDataSource source = new DruidDataSource();
        source.setPassword(this.jdbcProperties.getPassword());
        source.setUsername(this.jdbcProperties.getUsername());
        source.setUrl(this.jdbcProperties.getUrl());
        source.setDriverClassName(this.jdbcProperties.getDriverclassname());
        System.out.println(this.jdbcProperties.getDriverclassname());
        return source;
    }

}
