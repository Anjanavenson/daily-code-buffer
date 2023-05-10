package com.dailycodebuffer.Springboot.tutorial.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//     @Component    // if we put this it will put this class in the spring container
//     @Controller   // In this it contains the @component
@RestController      // It always returns a response body
public class HelloController {
    // @RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping("/")   //it internally contains request mapping
    public String HelloWorld(){
        return "Welcome to the Hello World!!";
    }
}
