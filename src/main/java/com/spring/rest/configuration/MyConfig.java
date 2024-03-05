package com.spring.rest.configuration;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.spring.rest")
@EnableWebMvc
public class MyConfig {
//    @Bean
//    public DataSource datasource() {
//        ComboPooledDataSource datasource = new ComboPooledDataSource;
//    }
}
