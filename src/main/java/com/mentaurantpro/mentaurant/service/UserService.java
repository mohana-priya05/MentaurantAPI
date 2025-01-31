package com.mentaurantpro.mentaurant.service;


import com.mentaurantpro.mentaurant.dto.LoginRequestDto;
import com.mentaurantpro.mentaurant.entity.Users;

import java.util.List;

public interface UserService {

    String getUsersByFirstName (String firstName);
    String getUsersByLastName (String lastName);
    String getUsersByEmail (String email);
    String getUsersByPassword (String password);
    public List<Users> getAddUsers(List<LoginRequestDto> login);
    public Users getDetail(LoginRequestDto signup);





}
