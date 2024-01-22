package com.userRegistration.controller;

import com.userRegistration.repository.entities.User;
import com.userRegistration.service.UserService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

@Controller
@Setter
public class FormContoller {
    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        System.out.println("Initialised form controller");
    }

    @RequestMapping("/form")
    public String userForm() {
        System.out.println("This is a form page");
        return "form";
    }
    @PostMapping("submit-form")
    public String handleForm(@ModelAttribute User user, Model model) {
        System.out.println(user);
        userService.registerUser(user);
        System.out.println("Registered user");
        return "success";
    }

}
