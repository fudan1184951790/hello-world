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

    @RequestMapping("/hello")
    public String hello2(String name){
        return "hello, " + name;
    }

    @RequestMapping("/hello")
    public String hello4(String name){
        return "hello, " + name;
    }

    @RequestMapping("/hello")
    public String hello3(String name){
        return "hello, " + name;
    }

    @RequestMapping("/hello")
    public String hello5(String name){
        return "hello, " + name;
    }

    @RequestMapping("/hello")
    public String hello6(String name){
        return "hello, " + name;
    }
    @RequestMapping("/hello")
    public String hello7(String name){
        return "hello, " + name;
    }
}
