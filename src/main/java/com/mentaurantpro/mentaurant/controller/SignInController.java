package com.mentaurantpro.mentaurant.controller;

//import com.mentaurantpro.mentaurant.dto.APIResponseDTO;
import com.mentaurantpro.mentaurant.dto.Response;
import com.mentaurantpro.mentaurant.dto.SignInDto;
import com.mentaurantpro.mentaurant.dto.UserUpdateDTO;
import com.mentaurantpro.mentaurant.service.SignInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SignInController {
    @Autowired
    SignInService signInService;

    @PostMapping("/signin")
    public ResponseEntity<Response> postMethod(@RequestBody SignInDto signInUser){
        return signInService.getSignInEntityByEmail(signInUser.getEmail(), signInUser.getPassword());


    }
    @PutMapping("/update")

    public ResponseEntity<Response> putMethod(@RequestBody UserUpdateDTO userUpdateDTO){
        return signInService.UpdateUserDTO(userUpdateDTO);
    }

}
