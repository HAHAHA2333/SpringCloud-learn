package com.example.eurekaprovider.controller;

import com.example.eurekaprovider.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value="/hello",method = RequestMethod.GET)
    public String hello() {
        return "hello feign !";
    }
    @GetMapping("/hello1")
    public String hello(@RequestParam  ("name") String name) {
        return "name: "+ name;
    }
    @RequestMapping(value = "/hello2",method = RequestMethod.GET)
    public User hello(@RequestParam ("name") String name, @RequestHeader Integer age){
        return new User(name,age);
    }
    @RequestMapping(value = "/hello3",method = RequestMethod.POST)
    public String hello(@RequestBody User user){
        return "hello,"+user.getName()+","+user.getAge();
    }
}
