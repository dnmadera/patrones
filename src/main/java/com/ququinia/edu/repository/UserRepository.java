package com.ququinia.edu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ququinia.edu.model.user.AppUser;

@Repository
public interface UserRepository extends JpaRepository < AppUser, Long > {
    AppUser findByEmail(String email);

    AppUser findByUsername(String userName);
}