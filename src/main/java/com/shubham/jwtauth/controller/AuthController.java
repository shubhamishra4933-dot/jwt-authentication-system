package com.shubham.jwtauth.controller;

import com.shubham.jwtauth.dto.AuthRequest;
import com.shubham.jwtauth.dto.AuthResponse;
import com.shubham.jwtauth.entity.User;
import com.shubham.jwtauth.security.JwtUtil;
import com.shubham.jwtauth.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @Autowired
    private JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user) {
        return authService.register(user);
    }

    @GetMapping("/user/{username}")
    public User getUser(@PathVariable String username) {
        return authService.getUser(username);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody AuthRequest request) {

        User user = authService.getUser(request.getUsername());

        if (user == null) {
            throw new RuntimeException("User not found");
        }

        String token = jwtUtil.generateToken(user.getUsername());

        return new AuthResponse(token);
    }
}
