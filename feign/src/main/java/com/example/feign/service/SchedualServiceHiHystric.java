package com.example.feign.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHiHystric implements FeignService{
    @Override
    public String hi(String name) {
        return  "feign ... name:" + name + " 系統錯誤,调用接口失败~!!";
    }
}
