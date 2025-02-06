package com.mentaurantpro.mentaurant.service;


import com.mentaurantpro.mentaurant.dto.SignUpRequestDto;
import com.mentaurantpro.mentaurant.entity.Users;

import java.util.List;

public interface UserService {

    String getUsersByFirstName (String firstName);
    String getUsersByLastName (String lastName);
    String getUsersByEmail (String email);
    String getUsersByPassword (String password);
    public List<Users> getAddUsers(List<SignUpRequestDto> login);
    public Users getDetail(SignUpRequestDto signup);





}
