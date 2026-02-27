package com.jmdcode.curso.springboot.webapp.springboot_web.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmdcode.curso.springboot.webapp.springboot_web.models.User;
import com.jmdcode.curso.springboot.webapp.springboot_web.models.dtos.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details-map")
    public Map<String, Object> details() {
        User user = new User("Juan", "Damas");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Details Map");
        body.put("user", user);
        return body;
    }

    @GetMapping("/details-dto")
    public UserDto detailsDto() {
        User user = new User("Juan", "Damas");
        UserDto userDto = new UserDto("Details DTO", user);
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Juan", "Damas");
        User user2 = new User("Maria", "Lopez");
        User user3 = new User("Pedro", "Rodriguez");
        User user4 = new User("Ana", "Perez");
        User user5 = new User("Luis", "Gomez");
        User user6 = new User("Carlos", "Martinez");
        User user7 = new User("Jorge", "Fernandez");
        User user8 = new User("Silvia", "Gonzalez");
        User user9 = new User("Fernando", "Sanchez");
        User user10 = new User("Miguel", "Serrano");

        return Arrays.asList(user, user2, user3, user4, user5, user6, user7, user8, user9, user10);
    }
}
