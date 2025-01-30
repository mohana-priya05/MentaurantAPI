package com.mentaurantpro.mentaurant.controller;

import com.mentaurantpro.mentaurant.dto.LoginRequestDto;
import com.mentaurantpro.mentaurant.service.UserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;

//    @PostMapping("/login")
//    public String postMethod(@RequestBody LoginRequestDto login) {
//        System.out.println("users : "+ login);
//
//        return userService.getUserByUsername(login.getUsername(),0);
//    }

    @PostMapping("/logins")
    public String postMethod(@RequestBody LoginRequestDto login){
        System.out.println("login : "+ login);
        return userService.getUserPasswordAndEmail(login.getUsername(),login.getUserpassword());
    }


}
