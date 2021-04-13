package com.example.demo;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    
    static int counter = 0;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        
        counter += new Date().toString().length();
        
        System.out.println(counter);
        
        String sss = "hello " + new Date();
        
        sss = sss + counter;
        
        return sss;
    }

}
