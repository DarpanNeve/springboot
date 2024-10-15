package com.darpan.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewClass {

    @GetMapping("abc")
    public String sayHello(){
        return "Hello world";
    }

    @GetMapping("bcd")
    public String newHello(){
        return "Hello world";
    }
}
