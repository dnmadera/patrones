package com.ququinia.edu.model;

public class Cuota {

    private Double capital;
    private Double interes;
    private Integer numero;


    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return String.format("Cuota{capital=$%.2f , interes=$%.2f , numero=%s}",  capital ,interes , numero);
    }
}
