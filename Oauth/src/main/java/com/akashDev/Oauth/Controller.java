package com.akashDev.Oauth; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello")
    public String welcome() {
        return "Welcome to the secured application!";
    }
}