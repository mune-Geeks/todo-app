package com.c4c.todoApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    // new a controller method to show "Hello, World!" html form

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    // need a controller method to process the html form

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloworld";
    }
}
