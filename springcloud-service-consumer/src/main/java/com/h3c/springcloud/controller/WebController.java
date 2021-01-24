package com.h3c.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class WebController {
    @Autowired
    private RestTemplate restTemplate;
    @RequestMapping("/web/hello")
    public String hello(){
        //调用远端springcloud provider服务
        return restTemplate.getForEntity( "http://localhost:8080/service/hello",String.class).getBody();
    }
}
