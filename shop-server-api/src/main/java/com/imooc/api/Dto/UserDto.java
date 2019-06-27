package com.imooc.api.Dto;

import lombok.Data;

@Data
public class UserDto {

    private Integer id;

    private String name;

    private String password;

    private String salt;
}
