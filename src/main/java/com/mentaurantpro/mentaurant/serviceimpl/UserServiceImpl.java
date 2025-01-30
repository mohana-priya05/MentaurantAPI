package com.mentaurantpro.mentaurant.serviceimpl;

import com.mentaurantpro.mentaurant.dto.LoginRequestDto;
import com.mentaurantpro.mentaurant.entity.Users;
import com.mentaurantpro.mentaurant.repository.UserRepository;
import com.mentaurantpro.mentaurant.service.UserService;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String getUsersByFirstName(String firstName) {
        Optional<Users> users = userRepository.findByFirstName(firstName);
        return "user";
    }

    @Override
    public String getUsersByLastName(String lastName) {
        Optional<Users> users = userRepository.findByLastName(lastName);
        return "";

    }

    @Override
    public String getUsersByEmail(String email) {
        Optional<Users> users = userRepository.findByEmail(email);
        return "";
    }

    @Override
    public String getUsersByPassword(String password) {
        Optional<Users> users = userRepository.findByPassword(password);
        return "";
    }

    @Override
    public List<Users> getAddUsers(List<LoginRequestDto> logins) {
        List<Users> usersArray = new ArrayList<>();
        logins.forEach(((user) -> {
            Users userDetail = new Users();
            userDetail.setFirstName(user.getFirstName());
            userDetail.setLastName(user.getLastName());
            userDetail.setEmail(user.getEmail());
            userDetail.setPassword(user.getPassword());
            Users savedUsers = userRepository.save(userDetail);
            usersArray.add(savedUsers);
        }));
        return usersArray;
    }

//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public String getUserByUsername(String email, Integer isDeleted) {
//        Optional<Users> users = userRepository.findByEmail(email);
//        System.out.println("users : "+ users);
//        if(users.isEmpty()){
//            return "Invalid Email";
//        }
//
//        return users.get().getFirstName()+ " " +users.get().getLastName();
//
//
//    }

}
