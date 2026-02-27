package com.jmdcode.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jmdcode.curso.springboot.webapp.springboot_web.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Juan", "Damas");
        user.setEmail("juan.damas@gmail.com");

        model.addAttribute("title", "Details");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model) {
        // List<User> users = new ArrayList<>();
        // users.add(new User("Juan", "Damas"));
        // users.add(new User("Maria", "Lopez"));
        // users.add(new User("Pedro", "Rodriguez"));

        model.addAttribute("title", "List Users");
        // model.addAttribute("users", users);
        return "list";
    }

    @ModelAttribute("users")
    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        users.add(new User("Juan", "Damas"));
        users.add(new User("Maria", "Lopez"));
        users.add(new User("Pedro", "Rodriguez"));
        return users;
    }
}
