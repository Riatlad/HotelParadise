package com.politecnicomalaga.hotel.Control;



import com.politecnicomalaga.hotel.Basurilla.Cliente;
import com.politecnicomalaga.hotel.Basurilla.Habitacion;
import com.politecnicomalaga.hotel.Basurilla.Peticion;
import com.politecnicomalaga.hotel.Basurilla.Respuesta;
import com.politecnicomalaga.hotel.Basurilla.VistaCliente;
import com.politecnicomalaga.hotel.Basurilla.VistaHabitacion;
import com.politecnicomalaga.hotel.MainActivity;

import java.util.List;

public class MainController {
    private static MainController mySingleController;
    private Respuesta respuesta;
    private Peticion peticion;
    private List<Cliente> listadoClientes;
    private List<Habitacion> listadoHabitaciones;
    private static MainActivity activeActivity;
    private VistaHabitacion vistaHabitacion;
    private VistaCliente vistaCliente;
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
        peticion.listarClientes();
    }
    public void parsearListadoClientes(String datos) {
        listadoClientes = respuesta.parsearClientes(datos);
        vistaCliente.cargarDatos(listadoClientes);
    }
    public void obtenerHabitaciones() {
        peticion.listarHabitaciones();
    }
    public void parsearListadoHabitaciones(String datos) {
        listadoHabitaciones = respuesta.parsearHabitaciones(datos);
        vistaHabitacion.cargarDatos(listadoHabitaciones);
    }
}

