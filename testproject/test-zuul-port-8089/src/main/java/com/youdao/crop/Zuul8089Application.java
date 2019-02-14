package com.youdao.crop;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class Zuul8089Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul8089Application.class,args);
    }
}
