package com.fortis.realworld.controller;

import com.fortis.realworld.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService userService;

    @Autowired

    public UserController(UserService userService) {
        this.userService = userService;
    }

}
