package com.itheima.eurekafeignclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name="eureka-provider")
@Service
public interface FeignService {
        @RequestMapping(value = "/hello", method = RequestMethod.GET )
        public String hello();
}
