package com.ab.dh.demogateway;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableApolloConfig(value = {"application","TEST1.cache-redis","TEST1.db-mysql",
        "TEST1.orm-mybatis","TEST1.monitor-actuator","TEST1.registry-eureka","TEST1.gateway"})
@EnableEurekaClient
public class DemoGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGatewayApplication.class, args);
    }

}
