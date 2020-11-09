package com.imooc.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@ApiIgnore
@RestController
public class HelloController {


    @GetMapping("/hello")
    public Object hello() {

        return "Hello World~";

    }




}
