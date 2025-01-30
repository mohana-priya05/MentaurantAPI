package com.mentaurantpro.mentaurant.service;

public interface SignInService {
    String getSignInEntityByEmail (String email ,String password);
    String getSigInEntityByPassword (String password);

}
