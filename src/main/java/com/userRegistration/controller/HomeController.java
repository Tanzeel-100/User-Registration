package com.userRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {
    @RequestMapping("/")
    public RedirectView base() {
        System.out.println("This is base page");
        RedirectView redirectView = new RedirectView();
        redirectView.setUrl("form");
        return redirectView;
    }

    @RequestMapping("/home")
    public String home() {
        System.out.println("This is home page");
        return "home";
    }
}
