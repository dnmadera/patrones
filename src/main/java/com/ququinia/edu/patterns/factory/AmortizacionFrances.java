package com.ququinia.edu.patterns.factory;

import com.ququinia.edu.model.Cuota;

import java.util.ArrayList;
import java.util.List;

public class AmortizacionFrances implements Amortizacion {

    @Override
    public List<Cuota> generateFees(Double capitalRestante, Integer period, Double tna) {
        List<Cuota> result = new ArrayList<Cuota>();
        Double tem = tna / 12.0;

        //Valor Cuota = C0 * (i / (1-(1+i))^n
        //Ik = I(k-1) * i
        //Ck = ValorCuota - Ik

        Double valorCuotaFija = capitalRestante * tem / (1-Math.pow(1+tem,-period));
        System.out.println(String.format("valor cuota $%.2f", valorCuotaFija));

        for (int i = 1; i <= period; i++) {

            Double interes = capitalRestante * tem;
            Cuota c = new Cuota();
            c.setNumero(i);

            c.setInteres(interes);
            c.setCapital(valorCuotaFija-interes);

            Double capitalCuota = (valorCuotaFija - interes);
            capitalRestante = capitalRestante - capitalCuota;
            //System.out.println(String.format("valor cuota capital %.2f interes %.2f capital %.2f", capitalCuota, interes, capitalRestante));

            result.add(c);
        }
        return result;
    }
}
