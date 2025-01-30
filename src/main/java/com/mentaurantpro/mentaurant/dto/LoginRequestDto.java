package com.mentaurantpro.mentaurant.dto;

public class LoginRequestDto {
    private String username;
    private String userpassword;

    public LoginRequestDto(String userpassword) {
        this.userpassword = userpassword;
    }
    public String getUserpassword() {
        return userpassword;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
//    , String password
}
