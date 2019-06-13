package com.three_developers_team.controller;

import com.three_developers_team.model.entity.Restaurant;
import com.three_developers_team.model.entity.User;
import com.three_developers_team.model.service.RestaurantService;
import com.three_developers_team.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/addUser")
    public String addUser(@RequestParam String name, @RequestParam String password, @RequestParam String restaurantId, @RequestParam String nickname) {
        Restaurant restaurant = restaurantService.findById(Long.parseLong(restaurantId));
        User user = new User(name, password, nickname, restaurant);
        userService.addUser(user);
        return "/WEB-INF/index.jsp";
    }

    @PostMapping("/updateUser")
    public String updateUser(@RequestParam String name, @RequestParam String nickName, @RequestParam String password, HttpServletRequest request) {
        User sessionUser = (User) request.getSession().getAttribute("user");
        sessionUser.setName(name);
        sessionUser.setNickname(nickName);
        sessionUser.setPassword(password);
        userService.updateUser(sessionUser);
        return "/WEB-INF/user.jsp";
    }

    @PostMapping("/entryUser")
    public String entry(@RequestParam String nickName, @RequestParam String password, HttpServletRequest request) {
        User user = userService.findUserByNicknameAndPassword(nickName, password);
        request.getSession().setAttribute("user", user);
        request.setAttribute("user", user);
        return "/WEB-INF/user.jsp";
    }

}
