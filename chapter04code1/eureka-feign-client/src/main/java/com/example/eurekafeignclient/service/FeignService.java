package com.example.eurekafeignclient.service;

import com.example.eurekafeignclient.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="eureka-provider")//指定调用的服务
@Service
public interface FeignService {
       // @RequestMapping(value = "/hello", method = RequestMethod.GET ) //指定要调用的服务的接口
        @GetMapping("/hello")
        public String hello();



}
