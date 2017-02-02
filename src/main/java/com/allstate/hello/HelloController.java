package com.allstate.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String helloWorld(@RequestParam(value="name", required=false, defaultValue = "Spring") String name) {
        return "Hello from " + name + "!";
    }

}