package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.kata.spring.boot_security.demo.service.UserServiceImpl;
import java.security.Principal;

@Controller
public class UserController {

    private UserServiceImpl userService;
    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public String userPage() {
        return "user";
    }

    @RequestMapping("/userProfile")
    public String userProfile(Principal principal, Model model){
        model.addAttribute("userProfile", userService.findByUsername(principal.getName()));
        return "user-profile";

    }
}
