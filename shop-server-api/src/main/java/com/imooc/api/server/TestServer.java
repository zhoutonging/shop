package com.imooc.api.server;

import com.imooc.api.Dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public interface TestServer {

    public String helloWorld();

    /**
     * 查询所有用户
     *
     * @return
     */
    List<UserDto> findAll();
}
