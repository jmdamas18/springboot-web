package com.jmdcode.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jmdcode.curso.springboot.webapp.springboot_web.models.User;
import com.jmdcode.curso.springboot.webapp.springboot_web.models.dtos.ParamDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    // @Value("${config.code}")
    // private Long code;

    @Value("${config.username}")
    private String username;

    @Value("${config.name}")
    private String name;

    @Value("${config.last-name}")
    private String lastName;

    @GetMapping("/baz/{message}")
    public ParamDto baz(@PathVariable String message) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);
        return paramDto;
    }

    @GetMapping("/mix/{product}/{id}")
    public Map<String, Object> mix(@PathVariable String product, @PathVariable Long id) {
        Map<String, Object> response = new HashMap<>();
        response.put("product", product);
        response.put("id", id);
        return response;
    }

    @PostMapping("/create-user")
    public User createUser(@RequestBody User user) {
        user.setName(name);
        user.setLastName(lastName);
        user.setActive(true);
        return user;
    }

    @GetMapping("/get-user-values")
    public Map<String, Object> getUser(@Value("${config.code}") Long id) {
        Map<String, Object> response = new HashMap<>();
        response.put("id", id);
        response.put("username", username);
        response.put("name", name);
        response.put("lastName", lastName);
        return response;
    }

}
