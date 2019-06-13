package com.three_developers_team.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping
    public String welcomePage(){
        return "/WEB-INF/index.jsp";
    }

    @GetMapping("/entry")
    public String entry(){
        return "/WEB-INF/entry.jsp";
    }
}
