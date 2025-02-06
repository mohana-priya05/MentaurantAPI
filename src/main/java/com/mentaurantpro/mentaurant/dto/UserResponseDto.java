package com.mentaurantpro.mentaurant.dto;

public class UserResponseDto {
    String fristName;
    String lastName;
    String email;
    Integer roleId;

    public UserResponseDto(String fristName, String lastName, String email, Integer roleId) {
        this.fristName = fristName;
        this.lastName = lastName;
        this.email = email;
        this.roleId = roleId;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }
}
