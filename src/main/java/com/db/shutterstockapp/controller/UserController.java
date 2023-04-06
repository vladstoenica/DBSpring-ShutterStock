package com.db.shutterstockapp.controller;

import com.db.shutterstockapp.entity.User;
import com.db.shutterstockapp.service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/id")
    public User getUserById(@RequestParam(name = "id") int id){
        return userService.findById(id);
    }
}
