package com.imooc.shopbusiness.mapper;

import com.imooc.api.Dto.UserDto;

import java.util.List;

public interface UserMapper {

    /**
     * 查询用户列表
     *
     * @return
     */
    List<UserDto> findAll();
}

