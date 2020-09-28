package com.itheima.eurekaribbonclient.controller;

import com.itheima.eurekaribbonclient.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by itcast on 2019/10/18.
 */
@RestController
public class RibbonController {
    @Autowired
    RibbonService ribbonService;
    @RequestMapping("/hi")
    public  String hi(){
        return ribbonService.hi();
    }
}
