package com.four.springbootdemo01.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/4/14.
 */

@RestController
@RequestMapping("/echo")
public class EchoController {
    @RequestMapping("/hello")
    public String hello(String name){
        return "hello, " + name;
    }
}