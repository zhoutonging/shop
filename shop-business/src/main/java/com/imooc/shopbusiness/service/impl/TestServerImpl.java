package com.imooc.shopbusiness.service.impl;

import com.imooc.api.Dto.UserDto;
import com.imooc.api.server.TestServer;
import com.imooc.shopbusiness.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServerImpl implements TestServer {

    @Autowired
    private UserMapper userMapper;

    @Override
    public String helloWorld() {
        return "helloWorld,我来自";
    }

    @Override
    public List<UserDto> findAll() {
        return userMapper.findAll();
    }
}
