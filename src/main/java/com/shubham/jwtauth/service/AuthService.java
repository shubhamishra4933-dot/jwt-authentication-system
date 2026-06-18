package com.shubham.jwtauth.service;

import com.shubham.jwtauth.entity.User;
import com.shubham.jwtauth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private UserRepository repository;

    public User register(User user) {
        return repository.save(user);
    }

    public User getUser(String username) {
        return repository.findByUsername(username);
    }
}
