package com.mentaurantpro.mentaurant.repository;

import com.mentaurantpro.mentaurant.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository <Users, Integer> {
    Optional <Users> findByFirstName(String firstName);
    Optional <Users> findByLastName(String lastName);
    Optional <Users> findByEmail(String email);
    Optional <Users> findByPassword(String password);
}
