package com.shubham.jwtauth.controller;

import com.shubham.jwtauth.entity.User;
import com.shubham.jwtauth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return authService.getUser(username);
    }
}
