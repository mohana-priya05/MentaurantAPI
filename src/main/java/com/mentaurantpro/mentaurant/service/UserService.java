package com.mentaurantpro.mentaurant.service;

import com.mentaurantpro.mentaurant.entity.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;


public interface UserService {
    String getUserByUsername(String email, Integer isDeleted);
//    String getUserPasswordAndEmail(String email, String password);

}
