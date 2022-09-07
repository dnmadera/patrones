package com.ququinia.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ququinia.edu.model.Patron;
import com.ququinia.edu.repository.PatronRepository;

@Service
class PatronServiceImpl implements PatronService {

    @Autowired
    private PatronRepository patronRepository;

    @Override
    public List<Patron> getAll() {
        return patronRepository.findAll();
    }

    

  
}