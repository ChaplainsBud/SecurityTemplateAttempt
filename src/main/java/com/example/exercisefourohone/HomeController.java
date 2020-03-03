package com.example.exercisefourohone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.security.Principal;

@Controller
public class HomeController {
//    @RequestMapping("/")
//    public String index(){
//        return "index";
//    }

//    @RequestMapping("/")
//    public String course(){
//        return "course";
//    }

    // 4.05 Persisting Current User Information
    @Autowired
    UserRepository userRepository;

    public String secure(Principal principal, Model model){
        String username = principal.getName();
        model.addAttribute("user", userRepository.findByUsername(username));
        return "secure";
    }
   // above, Persisting Current User Information


    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/secure")
    public String secure(){
        return "secure";
    }


//    @RequestMapping("/student")
//        public String student(){
//        return "student";
//    }
//
//    @RequestMapping("/teacher")
//    public String teacher(){
//        return "teacher";
//    }

//    @RequestMapping("/error")
//    public String error(){
//        return "error";
//    }

    // REALLY WEIRD: The error template works without the RequestMapping!!!!


//    @RequestMapping("/next-page")
//    public String nexter(){
//        return "next";
//    }
//
//    @RequestMapping("/admin")
//    public String admin(){
//        return "admin";
//    }
}

// why does it sometimes go to the white error page?
// valid user and password does not always work...
