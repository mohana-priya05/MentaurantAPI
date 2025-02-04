package com.mentaurantpro.mentaurant.serviceimpl;

//import com.mentaurantpro.mentaurant.entity.SignInEntity;
import com.mentaurantpro.mentaurant.entity.Users;
//import com.mentaurantpro.mentaurant.repository.SignInRepository;
import com.mentaurantpro.mentaurant.repository.UserRepository;
import com.mentaurantpro.mentaurant.service.SignInService;
import com.mentaurantpro.mentaurant.utils.EncryptionDecryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SignInServiceImpl implements SignInService {
    @Value("${encryption.secret}") String secretKey ;
    @Autowired
    UserRepository userRepository;
    @Override
    public String getSignInEntityByEmail(String email , String password) {
        Optional<Users> signInUser = userRepository.findByEmail(email);
        if(signInUser.isEmpty()){
            return "invalid email";
        }
        String decrptedpass = EncryptionDecryption.decrypt(signInUser.get().getPassword(), secretKey);
        System.out.println(signInUser);
        if(decrptedpass.equals(password)){
            return "login successfull";
        }

        return "invalid credentials";
    }

    @Override
    public String getSigInEntityByPassword(String password) {
//        Optional <SignInEntity> signInUser = signInRepository.findByPassword(password);
//        if (signInUser.isEmpty()){
//            return "password required";
//        }
//        return signInUser.get().getEmail();
        return "";
    }
}
