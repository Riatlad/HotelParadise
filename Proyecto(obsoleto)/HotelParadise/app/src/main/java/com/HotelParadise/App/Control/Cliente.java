package com.HotelParadise.App.Control;

public class Cliente {
    private String dni;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String numTarjeta;

    public Cliente(String dni, String nombre, String apellidos, String email, String telefono, String numTarjeta) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.numTarjeta = numTarjeta;
    }


    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }
}