package com.examples.marcus;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellpWorld {

    @RequestMapping("/")
    public String Talk(){
        return "Hello World";
    }
}
