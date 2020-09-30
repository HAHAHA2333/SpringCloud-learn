package com.itheima.eurekafeignclient.service;

public class HelloServiceImpl implements FeignService {

    public String hello() {
        return "feign consumer call finished!!!";
    }

}
