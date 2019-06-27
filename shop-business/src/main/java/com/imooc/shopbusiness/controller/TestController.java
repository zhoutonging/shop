package com.imooc.shopbusiness.controller;

import com.imooc.api.Dto.UserDto;
import com.imooc.api.server.TestServer;
import com.imooc.shopcommon.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @GetMapping("/findAll")
    public JsonData findAll() {
      List<UserDto> userDtoList = testServer.findAll();
        return JsonData.buildSuccess(userDtoList);
    }
}
