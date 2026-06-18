package com.shubham.jwtauth.security;

import java.util.Date;

public class JwtUtil {

    public String generateToken(String username) {

        return "jwt-token-for-" + username + "-"
                + new Date().getTime();
    }
}
