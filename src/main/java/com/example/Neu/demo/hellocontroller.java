package com.example.Neu.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @GetMapping("/Hallo")
    public String hallo(){
        return "hallo";
    }
}
