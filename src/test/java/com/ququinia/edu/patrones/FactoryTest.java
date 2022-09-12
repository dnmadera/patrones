package com.ququinia.edu.patrones;

import com.ququinia.edu.model.Cuota;
import com.ququinia.edu.patterns.factory.Amortizacion;
import com.ququinia.edu.patterns.factory.AmortizacionFactory;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FactoryTest {

    @Test
    public void directaTest(){

        Double capital = 10000.0;
        Integer periodo = 5;
        Double tna = 3.0/100;
        Amortizacion amort = AmortizacionFactory.getAmortizacion(AmortizacionFactory.DIRECTA);
        List<Cuota> cuotas = amort.generateFees(capital,periodo, tna);

        Double sumatoriaCuotas = 0.0;
        for (Cuota c: cuotas) {
            System.out.println(c);
            sumatoriaCuotas += c.getCapital() + c.getInteres();
        }

        System.out.println("Monto a Solicitado $" + capital);
        System.out.println("Monto a Devolver $" + sumatoriaCuotas);
        assert cuotas.size() == 12;
        assert cuotas.get(0).getCapital().equals(capital/periodo);

        assert sumatoriaCuotas.equals((1+tna)*capital);
    }



    @Test
    public void francesTest(){

        Double capital = 10000.0;
        Integer periodo = 12;
        Double tem = 208.0/100/12;

        Amortizacion amort = AmortizacionFactory.getAmortizacion(AmortizacionFactory.FRANCES);

        List<Cuota> cuotas = amort.generateFees(capital,periodo, tem);

        for (Cuota c: cuotas) {
            capital -= c.getCapital();
            System.out.println(String.format("cuota %s, restante $%.2f" , c, capital));

        }

        assert cuotas.size() == periodo;
        //assert cuotas.get(0).getCapital().equals(capital/periodo);
    }
}
