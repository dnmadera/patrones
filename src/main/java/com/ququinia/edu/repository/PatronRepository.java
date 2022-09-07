package com.ququinia.edu.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ququinia.edu.model.Patron;

@Repository
public interface PatronRepository extends JpaRepository < Patron, Long > {
}  