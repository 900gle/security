package com.doo.security.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
@RequestMapping("v1")
public class ApiRestController {


    @GetMapping("doo")
    public String getDoo(){
        return "doo";
    }
}
