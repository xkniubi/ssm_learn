package com.chuck.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.chuck")
@EnableAspectJAutoProxy
public class JavaConfig {

}
