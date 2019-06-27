package com.imooc.shopbusiness.controller;

import com.imooc.api.server.TestServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Autowired
    private TestServer testServer;

    @GetMapping("/helloWorld")
    public String helloWorld() {
        String str = testServer.helloWorld();
        return str + port;
    }
}
