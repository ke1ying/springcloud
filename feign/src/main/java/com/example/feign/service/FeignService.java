package com.example.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
@FeignClient(value = "EUREKA-CLIENT",fallback = SchedualServiceHiHystric.class)
public interface FeignService {

    @RequestMapping("/hi")
    public String hi(@RequestParam("name") String name);

}
