package com.imooc.shopwebadmin.feign.impl;

import com.imooc.shopwebadmin.feign.TestFeign;
import org.springframework.stereotype.Component;

@Component
public class TestFeignImpl implements TestFeign {

    @Override
    public String test() {
        return "Sorry,内部出现错误";
    }

    @Override
    public String findAll() {
        return "Sorry,内部出现错误";
    }
}
