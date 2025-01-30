package com.mentaurantpro.mentaurant.controller;

import com.mentaurantpro.mentaurant.dto.SignInDto;
import com.mentaurantpro.mentaurant.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SignInController {
    @Autowired
    SignInService signInService;

    @PostMapping("/sign-in")
    public Object postMethod(@RequestBody SignInDto signInUser){
        return signInService.getSignInEntityByEmail(signInUser.getEmail(), signInUser.getPassword());


    }

}
