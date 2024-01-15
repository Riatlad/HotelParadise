package com.HotelParadise.App.Model;

public class Habitacion {
    private String numero;
    private String tipo;

    public Habitacion(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }


    public String getTipo() {
        return tipo;
    }
}
