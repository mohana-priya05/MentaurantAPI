package com.mentaurantpro.mentaurant.repository;

import com.mentaurantpro.mentaurant.entity.UserRolesMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRolesMappingRepository extends JpaRepository<UserRolesMapping, Integer> {

   Optional<UserRolesMapping> findByUser_id(Integer user_id);
   Optional<UserRolesMapping> findByRole_id(Integer role_id);
}
