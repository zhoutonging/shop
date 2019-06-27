package com.imooc.shopbusiness.service.impl;

import com.imooc.api.server.TestServer;
import org.springframework.stereotype.Service;

@Service
public class TestServerImpl implements TestServer {



    @Override
    public String helloWorld() {
        return "helloWorld,我来自";
    }
}
