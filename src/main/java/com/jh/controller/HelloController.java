package com.jh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/v1")
    public String sayHello() throws InterruptedException {
        Thread.sleep(1000);
        return "hello";
    }
}
