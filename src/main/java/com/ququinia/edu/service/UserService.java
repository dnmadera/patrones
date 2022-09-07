package com.ququinia.edu.service;

import java.util.List;

import com.ququinia.edu.model.user.AppUser;

public interface UserService {

    public AppUser findUserByUserName(String userName);
    public List<AppUser> getAll();
}