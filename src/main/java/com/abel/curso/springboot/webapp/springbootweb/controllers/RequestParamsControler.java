package com.abel.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.abel.curso.springboot.webapp.springbootweb.dto.ParamDto;
import com.abel.curso.springboot.webapp.springbootweb.dto.ParamMixDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/params")

public class RequestParamsControler {

    @GetMapping("foo")
    public ParamDto foo(@RequestParam(required = false, defaultValue = "Holaa", name ="mensaje") String message) {
        
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar (@RequestParam String text, @RequestParam Integer code){
        ParamMixDto params = new ParamMixDto();
        params.setMessage(text);
        params.setCode(code);
        return params;
    }
    

}