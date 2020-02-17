package com.ab.dh.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("demo-service2")
@Component
public interface DemoService2Api {
    @RequestMapping("/demo-service2/hello")
    String hello();
}
