package com.example.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class HelloService {

    @Resource
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String hiService(String name){
//        return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name="+name,String.class);
        return restTemplate.getForObject("http://localhost:8083/hi?name="+name,String.class);
    }

    public String error(String name){
        return "参数为:"+name+",调用EUREKA-CLIENT 失败啦!";
    }
}
