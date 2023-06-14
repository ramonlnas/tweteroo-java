package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.AuthDTO;
import com.model.Auth;
import com.repository.AuthRepository;

@RestController
@RequestMapping("/api/sign-up")

public class AuthController {

    @Autowired
    private AuthRepository repository;
    
    @PostMapping
    public void postUser(@RequestBody AuthDTO req) {
        repository.save(new Auth(req));
    }
}
