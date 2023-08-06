package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.example.beans")
public class ProjectConfig {

    /*
    Spring @Configuration annotation is part of the spring core framework.
    Spring Configuration annotation indicates that the class has @Bean definition methods.
    So spring container can process the class and generate Spring Beans to be used in the application.

    To tell Spring it needs to search for classes annotated with stereotype annotations,
    we use the @CompanentsScan annotation over the configuration class.
     */
}
