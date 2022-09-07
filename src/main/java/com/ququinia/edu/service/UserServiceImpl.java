package com.ququinia.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ququinia.edu.repository.UserRepository;
import com.ququinia.edu.user.AppUser;

@Service
class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<AppUser> getAll() {
        return userRepository.findAll();
    }

    @Override
    public AppUser findUserByUserName(String userName) {
        // TODO Auto-generated method stub
        return userRepository.findByUsername(userName);
    }

  
}