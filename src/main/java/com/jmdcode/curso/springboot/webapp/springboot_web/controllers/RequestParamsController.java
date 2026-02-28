package com.jmdcode.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jmdcode.curso.springboot.webapp.springboot_web.models.dtos.ParamDto;
import com.jmdcode.curso.springboot.webapp.springboot_web.models.dtos.ParamMixDto;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api/params")
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDto foo(
            @RequestParam(required = false, defaultValue = "Message default") String message) {
        ParamDto paramDto = new ParamDto();
        paramDto.setMessage(message);

        return paramDto;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamMixDto paramsDto = new ParamMixDto();
        paramsDto.setMessage(text);
        paramsDto.setCode(code);

        return paramsDto;
    }

    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) {
        Integer code = 0;

        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
        }

        ParamMixDto paramsDto = new ParamMixDto();
        paramsDto.setMessage(request.getParameter("message"));
        paramsDto.setCode(code);

        return paramsDto;
    }
}
