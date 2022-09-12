package com.ququinia.edu.patterns.factory;

import com.ququinia.edu.model.Cuota;

import java.util.List;

public interface Amortizacion {
    public List<Cuota> generateFees(Double capital, Integer period, Double tna);
}
