package ru.gomeopatiya.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String redirectToLogin(){
        return "redirect:/login";
    }
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
}
