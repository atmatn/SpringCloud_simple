package com.youdao.crop;

import com.youdao.crop.controller.TestFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class Zuul8089Application {
    public static void main(String[] args) {
        SpringApplication.run(Zuul8089Application.class,args);
    }
    @Bean
    public TestFilter testFilter(){//重要一步，实例化我们自定义的过滤器
        return new TestFilter();
    }
}
