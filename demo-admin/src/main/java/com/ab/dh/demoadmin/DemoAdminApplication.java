package com.ab.dh.demoadmin;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableApolloConfig(value = {"application","TEST1.cache-redis","TEST1.db-mysql",
        "TEST1.orm-mybatis","TEST1.monitor-actuator","TEST1.registry-eureka"})
@EnableAdminServer
@EnableEurekaClient
public class DemoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoAdminApplication.class, args);
    }

}
