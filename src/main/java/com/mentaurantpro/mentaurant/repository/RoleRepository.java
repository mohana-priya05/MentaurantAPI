package com.mentaurantpro.mentaurant.repository;

import com.mentaurantpro.mentaurant.entity.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Roles, Integer> {
//    Optional<Roles> findyById()

}
