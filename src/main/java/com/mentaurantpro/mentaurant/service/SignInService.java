package com.mentaurantpro.mentaurant.service;

//import com.mentaurantpro.mentaurant.dto.APIResponseDTO;
import com.mentaurantpro.mentaurant.dto.Response;
import com.mentaurantpro.mentaurant.dto.UserUpdateDTO;
import org.springframework.http.ResponseEntity;

public interface SignInService {
    ResponseEntity<Response> getSignInEntityByEmail (String email , String password);
    String getSigInEntityByPassword (String password);
    ResponseEntity<Response> UpdateUserDTO (UserUpdateDTO userUpdateDTO);



}
