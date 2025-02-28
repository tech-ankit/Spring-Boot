package com.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/aws")
public class Controller {

    @GetMapping
    public String aws(){
        return "AWS Api Triggered";
    }

    @GetMapping(value = "aws2")
    public String asw2(){
        return "New AWS IS ADDED";
    }

    @GetMapping(value = "name")
    public String name(){
        return "Heyy Your Name Is Printed";
    }
    
}
