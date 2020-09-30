package com.itheima.eurekafeignclient.controller;


import com.itheima.eurekafeignclient.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
            @Autowired
            FeignService helloService;
            @RequestMapping(value="/hello",method = RequestMethod.GET)
            public String hello() {

                return  helloService.hello();
    }
}
