package com.h3c.springcloud.controller;

import com.h3c.springcloud.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    private HelloService helloService;

    @RequestMapping("/web/hello")
    public String hello(){
        //调用声明接口的方法
        return helloService.hello();
    }
}
