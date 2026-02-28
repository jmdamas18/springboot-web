package com.jmdcode.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping({ "", "/", "/home" })
    public String home() {
        // Redirect hace una nueva petición, por lo que es más lento
        return "redirect:/list";

        // La diferencia entre redirect y forward es que redirect hace una nueva
        // petición y forward no, por lo que forward es más rápido
        // return "forward:/list";
    }

}
