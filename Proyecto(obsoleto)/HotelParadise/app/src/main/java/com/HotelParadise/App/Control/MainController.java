package com.HotelParadise.App.Control;



import java.util.ArrayList;
import java.util.List;

public class MainController {
    private static MainController mySingleController;
    private Respuesta respuesta;
    private Peticion peticion;
    private ArrayList<Cliente> listadoClientes;
    private ArrayList<Habitacion> listadoHabitaciones;
    private static MainActivity activeActivity;
    private VistaHabitacionActivity vistaHabitacion;
    private VistaClienteActivity vistaCliente;
    private MainController() {
        respuesta = new Respuesta();
        peticion = new Peticion();
    }


    public static MainController getSingleton() {
        if (MainController.mySingleController == null) {
            mySingleController = new MainController();
        }
        return mySingleController;
    }
    public void obtenerClientes() {
        peticion.listar("Clientes");
    }
    public void parsearListadoClientes(String datos) {
        listadoClientes = respuesta.parsearClientes(datos);
        vistaCliente.cargarDatos(listadoClientes);
    }
    public void obtenerHabitaciones() {
        peticion.listar("Habitaciones");
    }
    public void parsearListadoHabitaciones(String datos) {
        listadoHabitaciones = respuesta.parsearHabitaciones(datos);
        vistaHabitacion.cargarDatos(listadoHabitaciones);
    }

    public void setError(String respuesta) {

    }
}

