package com.imooc.shopwebadmin.feign;

import com.imooc.shopwebadmin.feign.impl.TestFeignImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "shop-business",fallback = TestFeignImpl.class)
public interface TestFeign {

    @GetMapping("/helloWorld")
    String test();

    @GetMapping("/findAll")
    String findAll();
}
