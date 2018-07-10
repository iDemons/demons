package com.tqh.demo.controller;

import com.tqh.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: demo
 * @description:
 * @author: Demons
 * @create: 2018-07-08 10:24
 */


@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser/{id}")
    public String selectUser(@PathVariable int id) {
        return userService.selectUser(id).toString();

    }
}