package com.ququinia.edu.patterns.factory;

public class AmortizacionFactory {

    public static final String DIRECTA = "directa";
    public static final String FRANCES = "frances";

    public static Amortizacion getAmortizacion(String tipo){

        Amortizacion amortizacion = null;

        if (DIRECTA.equals(tipo)) {
            amortizacion = new AmortizacionDirecta();
        } else if (FRANCES.equals(tipo)){
            amortizacion = new AmortizacionFrances();
        }

        return amortizacion;
    }

}
