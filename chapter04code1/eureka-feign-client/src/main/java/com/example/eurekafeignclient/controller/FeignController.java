package com.example.eurekafeignclient.controller;

import com.example.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    FeignService helloService;
    @RequestMapping(value="/hi",method = RequestMethod.GET)
    public String hello() {

        return  helloService.hello();
    }
}
