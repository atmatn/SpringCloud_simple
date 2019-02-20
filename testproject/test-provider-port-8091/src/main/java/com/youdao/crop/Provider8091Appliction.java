package com.youdao.crop;

//import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@SpringBootApplication
@RestController
public class Provider8091Appliction {
    public static void main(String[] args) {
        SpringApplication.run(Provider8091Appliction.class, args);
    }
//
//    @Value("${application}")
//    String hello;
//
//    @RequestMapping(value = "/config", method = RequestMethod.GET)
//    public String getConfig() {
//        return hello;
//    }
}
