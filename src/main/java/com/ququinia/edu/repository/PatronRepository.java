package com.ququinia.edu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ququinia.edu.model.Patron;

import java.util.List;

@Repository
public interface PatronRepository extends JpaRepository < Patron, Long > {
    @Query("SELECT t FROM Patron t WHERE t.name = ?1")
    List<Patron> findByName(String name);
}  