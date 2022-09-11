package com.ququinia.edu.service;

import java.util.List;

import com.ququinia.edu.model.Patron;

public interface PatronService {
    
    public List<Patron> getAll();

    Patron save(Patron p);

    List<Patron> findByName(String nuevoTXT);
}