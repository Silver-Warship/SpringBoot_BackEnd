package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/hello")
public class HelloController {

    @RequestMapping("/t")
    @ResponseBody
    public String hello(){
        return "Hi, I am t";
    }

    @RequestMapping("/a")
    @ResponseBody
    public String hi(){
        return "Hi, I am a";
    }
}
