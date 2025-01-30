package com.mentaurantpro.mentaurant.serviceimpl;

import com.mentaurantpro.mentaurant.entity.Users;
import com.mentaurantpro.mentaurant.repository.UserRepository;
import com.mentaurantpro.mentaurant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String getUserByUsername(String email, Integer isDeleted) {
        Optional<Users> users = userRepository.findByEmail(email);
        System.out.println("users : "+ users);
        if(users.isEmpty()){
            return "Invalid Email";
        }

        return users.get().getFirstName()+ " " +users.get().getLastName();


    }

}
