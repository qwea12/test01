package com.gp.User.controller;

import com.gp.User.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String test(){
        return "index";
    }

    @RequestMapping("/select")
    public List<Map<String, Object>> select(){
        return testService.testSelect();
    }

    @RequestMapping("/selectOne")
    public Map selectOne(){
        return testService.test();
    }
}
