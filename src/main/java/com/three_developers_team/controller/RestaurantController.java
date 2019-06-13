package com.three_developers_team.controller;

import com.three_developers_team.model.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping("/registration")
    public String registration(HttpServletRequest request){
        request.setAttribute("restaurants", restaurantService.findAll());
        return "/WEB-INF/registration.jsp";
    }

}
