package com.HotelParadise.App.Control;

public class Habitacion {
    private String numero;
    private String tipo;
    private String estado;
    private String capacidad;

    public Habitacion(String numero, String tipo, String estado, String capacidad) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado=estado;
        this.capacidad=capacidad;
    }

    public String getNumero() {
        return numero;
    }


    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String getCapacidad() {
        return capacidad;
    }
}