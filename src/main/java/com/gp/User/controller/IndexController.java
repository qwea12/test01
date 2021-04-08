package com.gp.User.controller;

import com.gp.User.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class IndexController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hello1")
    public String test() {
        return "index";
    }
}