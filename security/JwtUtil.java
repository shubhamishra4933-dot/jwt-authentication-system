package com.shubham.jwtauth.security;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class JwtUtil {

    public String generateToken(String username) {

        return "jwt-token-for-" + username + "-"
                + new Date().getTime();
    }
}
