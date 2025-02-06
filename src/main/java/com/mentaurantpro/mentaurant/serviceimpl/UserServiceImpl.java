package com.mentaurantpro.mentaurant.serviceimpl;

import com.mentaurantpro.mentaurant.dto.LoginRequestDto;
import com.mentaurantpro.mentaurant.entity.UserRolesMapping;
import com.mentaurantpro.mentaurant.entity.Users;
import com.mentaurantpro.mentaurant.dto.UserResponseDto;
import com.mentaurantpro.mentaurant.repository.UserRepository;
import com.mentaurantpro.mentaurant.repository.UserRolesMappingRepository;
import com.mentaurantpro.mentaurant.service.UserService;
import com.mentaurantpro.mentaurant.utils.EncryptionDecryption;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Value("${encryption.secret}")
    String secretKey;


    @Autowired
    UserRepository userRepository;

    @Autowired
    UserRolesMappingRepository userRolesMappingRepository;

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

    @Override
    public UserResponseDto getDetail(LoginRequestDto signup) {
        System.out.println("signup : "+ signup);
        Users user = new Users ();
        user.setFirstName(signup.getFirstName());
        user.setLastName(signup.getLastName());
        user.setEmail(signup.getEmail());



       String encryptedPass= EncryptionDecryption.encrypt(signup.getPassword() , secretKey);
        user.setPassword(encryptedPass);

         Users savedUser  = userRepository.save(user);
        UserRolesMapping rolesMapping = new UserRolesMapping();
        rolesMapping.setUser_id(savedUser.getId());
        rolesMapping.setRole_id(signup.getRole_id());

        UserRolesMapping savedRoles = userRolesMappingRepository.save(rolesMapping);

        UserResponseDto responseDto = new UserResponseDto(savedUser.getFirstName(),savedUser.getLastName(), savedUser.getEmail(), savedRoles.getRole_id());

        return responseDto;
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
