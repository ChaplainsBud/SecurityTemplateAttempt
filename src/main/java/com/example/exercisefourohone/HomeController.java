package com.example.exercisefourohone;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/next-page")
    public String nexter(){
        return "next";
    }
}

// why does it sometimes go to the white error page?
// valid user and password does not always work...
