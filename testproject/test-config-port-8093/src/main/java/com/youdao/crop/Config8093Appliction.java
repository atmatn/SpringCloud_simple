package com.youdao.crop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableConfigServer
@EnableEurekaClient
@SpringBootApplication
public class Config8093Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Config8093Appliction.class,args);
    }
}
