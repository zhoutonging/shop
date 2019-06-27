package com.imooc.shopwebadmin.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-business")
public interface TestFeign {

    @GetMapping("/helloWorld")
    String test();
}
