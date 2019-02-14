package com.youdao.crop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Provider8091Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Provider8091Appliction.class,args);
    }
}
