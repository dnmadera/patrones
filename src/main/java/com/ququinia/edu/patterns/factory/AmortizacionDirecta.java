package com.ququinia.edu.patterns.factory;

import com.ququinia.edu.model.Cuota;

import java.util.ArrayList;
import java.util.List;

public class AmortizacionDirecta implements Amortizacion {
    @Override
    public List<Cuota> generateFees(Double capital, Integer period, Double tna) {
        List<Cuota> result = new ArrayList<Cuota>();
        Double capitalCuota = capital/period;
        Double interesCuota = tna * capital / 12 ;
        for (int i = 1; i <= period; i++) {
            Cuota c = new Cuota();
            c.setNumero(i);
            c.setCapital(capitalCuota);
            c.setInteres(interesCuota);
            result.add(c);
        }
        return result;
    }
}
