package com.chuck.config;

import com.chuck.interceptor.MyInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    public void addInterceptor(InterceptorRegistry registry){
        registry.addInterceptor(new MyInterceptor());
    }

}
