package com.h3c.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration  //等价于一个spring applicationContext.xml配置文件
public class BeanConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
