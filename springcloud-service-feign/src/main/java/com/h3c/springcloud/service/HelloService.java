package com.h3c.springcloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/*绑定远程服务提供者名称

 */
@FeignClient("0X-SPRINGCLOUD-SERVICE-PROVIDER")
public interface HelloService {
    @RequestMapping("/service/hello")
    public String hello();
}
