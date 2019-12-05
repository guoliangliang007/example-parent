package com.example.cors.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@CrossOrigin(origins = "*")
public class CorsController {

    @RequestMapping("cors")
    @ResponseBody
    public String cors(){
        System.out.println("springBoot  cors");
        return "springboot cors";
    }
}
