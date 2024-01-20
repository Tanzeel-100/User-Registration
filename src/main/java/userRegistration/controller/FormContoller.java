package userRegistration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import userRegistration.model.User;

@Controller
public class FormContoller {
    @RequestMapping("/form")
    public String userForm() {
        System.out.println("This is a form page");
        return "form";
    }
    @PostMapping("submit-form")
    public String handleForm(@ModelAttribute User user, Model model) {
        System.out.println(user);
        return "success";
    }

}
