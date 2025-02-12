package com.mentaurantpro.mentaurant.serviceimpl;

//import com.mentaurantpro.mentaurant.entity.SignInEntity;

import com.mentaurantpro.mentaurant.dto.APIResponseDTO;
import com.mentaurantpro.mentaurant.entity.Users;
//import com.mentaurantpro.mentaurant.repository.SignInRepository;
import com.mentaurantpro.mentaurant.repository.UserRepository;
import com.mentaurantpro.mentaurant.service.SignInService;
import com.mentaurantpro.mentaurant.utils.EncryptionDecryption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SignInServiceImpl implements SignInService {
    @Value("${encryption.secret}")
    String secretKey;
    @Autowired
    UserRepository userRepository;

    @Override
    public ResponseEntity<Object> getSignInEntityByEmail(String email, String password) {
        Optional<Users> signInUser = userRepository.findByEmail(email);
        if (signInUser.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new APIResponseDTO("Failed", 404, "User Not Found for given input"));
        }
        String decrptedpass = EncryptionDecryption.decrypt(signInUser.get().getPassword(), secretKey);


//        HttpHeaders headers = new HttpHeaders();
//        headers.setContentType(MediaType.APPLICATION_JSON);
        if (decrptedpass.equals(password)) {
//            return ResponseEntity.ok().body(new APIResponseDTO("Success", 200, "User Logged In Successfully"));
            return ResponseEntity.ok().body("Success");
        }


        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new APIResponseDTO("Failed", 400, "Given input is wrong"));
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
