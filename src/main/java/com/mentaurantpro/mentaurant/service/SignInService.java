package com.mentaurantpro.mentaurant.service;

import com.mentaurantpro.mentaurant.dto.APIResponseDTO;
import org.springframework.http.ResponseEntity;

public interface SignInService {
    ResponseEntity<Object> getSignInEntityByEmail (String email , String password);
    String getSigInEntityByPassword (String password);

}
