package ru.kata.spring.boot_security.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.model.User;
import ru.kata.spring.boot_security.demo.service.UserService;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private UserService userService;
    @Autowired
    public AdminController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public String showAllUsers(Model model) {
        List<User> allUsers = userService.getAllUsers();
        model.addAttribute("allUsers", allUsers);
        return "all-users";
    }

    @GetMapping("/new")
    public String addNewUser(Model model) {
        User user = new User();
        model.addAttribute("userForAdd", user);
        return "user-info";

    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("userForAdd") User user) {
        userService.saveUser(user);
        return "redirect:/admin/all";
    }

    @GetMapping("/{id}/show")
    public String show(@PathVariable("id") Long id, Model model){
        model.addAttribute("userForUpdate", userService.getUser(id));
        return "user-show";

    }

    @PatchMapping("/{id}/updateUser")
    public String updateUser(@PathVariable("id") Long id, @ModelAttribute("userForUpdate") User user) {
        userService.updateUser(user);
        return "redirect:/admin/all";

    }

    @DeleteMapping("/{id}/deleteUser")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteUser(id);
        return "redirect:/admin/all";
    }
}
