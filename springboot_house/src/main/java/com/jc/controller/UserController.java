package com.jc.controller;


import com.jc.service.UserService;
import com.jc.support.AccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    AccessResult createUser(String name, String password, String password2){
        AccessResult accessResult = userService.createUser(name,password);
        return accessResult;
    }

    @RequestMapping("/login")
    AccessResult login(String name, String password){
        AccessResult accessResult = userService.login(name,password);
        return accessResult;
    }

}
