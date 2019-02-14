package com.youdao.crop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MyAppliction {
    public static void main(String[] args) {
        SpringApplication.run(MyAppliction.class,args);
    }
}
