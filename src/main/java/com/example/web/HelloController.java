package com.example.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Value("${build.version}")
    private int buildVersion;

    @GetMapping
    public String hello() {
        return "Build "+ buildVersion +"!";
    }

}
