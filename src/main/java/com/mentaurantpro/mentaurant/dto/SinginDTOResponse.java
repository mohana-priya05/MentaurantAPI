package com.mentaurantpro.mentaurant.dto;

public class SinginDTOResponse {
    private String firstName;
//    private String uniqueKey;
    private String lastName;
    private String email;
    private Integer role_id;
    private String name;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

//    public String getUniqueKey() {
//        return uniqueKey;
//    }
//
//    public void setUniqueKey(String uniqueKey) {
//        this.uniqueKey = uniqueKey;
//    }

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

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SinginDTOResponse(String firstName, String lastName, String email, Integer role_id, String name) {
//        this.uniqueKey = uniqueKey;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role_id = role_id;
        this.name = name;
    }
}
