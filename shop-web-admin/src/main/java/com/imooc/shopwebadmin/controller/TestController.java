package com.imooc.shopwebadmin.controller;

import com.imooc.shopwebadmin.feign.TestFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestFeign testFeign;

    @GetMapping("/test")
    public String test(){
        return testFeign.test();
    }

    @GetMapping("findAll")
    public String findAll() {
        return testFeign.findAll();
    }
}
