package com.imooc.shopbusiness;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.imooc"})
public class ShopBusinessApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopBusinessApplication.class, args);
    }

}
