package com.mentaurantpro.mentaurant.controller;

import com.mentaurantpro.mentaurant.dto.LoginRequestDto;
import jakarta.persistence.Entity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {
    @PostMapping("/login")
    public String postMethod( LoginRequestDto login) {
        return "";
    }


}
