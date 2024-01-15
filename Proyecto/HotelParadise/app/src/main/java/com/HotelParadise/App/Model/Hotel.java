package com.HotelParadise.App.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Habitacion> listaHabitaciones;

    public Hotel() {
        this.listaClientes = new ArrayList<>();
        this.listaHabitaciones = new ArrayList<>();
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }


}
