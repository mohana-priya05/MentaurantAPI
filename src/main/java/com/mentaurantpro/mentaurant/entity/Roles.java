package com.mentaurantpro.mentaurant.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table (name = "roleTable")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    @Column(name="name")
    private String roleName;

    private Integer createdBy;
    private LocalDateTime createdOn=LocalDateTime.now();

    private Integer updatedBy;

    private LocalDateTime updatedOn=LocalDateTime.now();
    private Integer isDeleted;

}
