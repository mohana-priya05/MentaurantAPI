package com.mentaurantpro.mentaurant.controller;

import com.mentaurantpro.mentaurant.dto.LoginRequestDto;
import com.mentaurantpro.mentaurant.dto.UserResponseDto;
import com.mentaurantpro.mentaurant.entity.Users;
import com.mentaurantpro.mentaurant.service.UserService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping("/sign-up")
    public List<Users> postMethod(@RequestBody List<LoginRequestDto> login) {

        //check if the user exists
        //check the provided password is correct
        //if yes-> success response else-> failed Response
        return userService.getAddUsers(login);


    }
    @PostMapping("/signup")

    public UserResponseDto signUpMethod(@RequestBody LoginRequestDto signup){
        return  userService.getDetail(signup);

    }



}
