package com.imooc.shopbusiness;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.imooc"})
@EnableEurekaClient
@MapperScan("com.imooc.shopbusiness.mapper")
public class ShopBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopBusinessApplication.class, args);
    }

}
