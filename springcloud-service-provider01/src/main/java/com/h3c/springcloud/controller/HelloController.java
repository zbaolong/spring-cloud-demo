package com.h3c.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/service/hello")
    public String hello(){
        return "hello, spring cloud";
    }
}
