package com.ab.dh.controller;

import com.ab.dh.feign.DemoService2Api;
import com.ctrip.framework.apollo.Config;
import com.ctrip.framework.apollo.spring.annotation.ApolloConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DJ015511
 */
@RestController
public class ConfigController {
    @ApolloConfig
    private Config config;
    @Autowired
    private DemoService2Api demoService2Api;

    @RequestMapping("/config/{key}")
    public String hello(@PathVariable String key) {
        System.out.println("线程池名称: " + Thread.currentThread().getName());
        return config.getProperty(key, "default");
    }

    @RequestMapping("/")
    public String ok() {
        System.out.println("线程池名称: " + Thread.currentThread().getName());
        return "I'm service1,OK!";
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("线程池名称: " + Thread.currentThread().getName());
        return demoService2Api.hello();
    }
}
