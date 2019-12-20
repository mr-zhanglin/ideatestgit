package com.hzdl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {

    @RequestMapping("hello")
    public String hello(){
        System.out.println("11111111");
        return "hello springboot";
    }
}
