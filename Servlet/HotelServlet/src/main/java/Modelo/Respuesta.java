package Modelo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Respuesta {

    public String clientesJSON(List<Cliente> listado) {
        Gson gson = new Gson();
        String clientesJSON = gson.toJson(listado);
        return clientesJSON;
    }

    public String habitacionesJSON(List<Habitacion> listado) {
        Gson gson = new Gson();
        String habitacionesJSON = gson.toJson(listado);
        return habitacionesJSON;
    }

    public String reservaJSON(ArrayList<Reserva> listado) {
        Gson gson = new Gson();
        String reservaJSON = gson.toJson(listado);
        return reservaJSON;
    }

    public String suplementosJSON(ArrayList<Suplemento> listado) {
        Gson gson = new Gson();
        String suplementosJSON = gson.toJson(listado);
        return suplementosJSON;
    }

    public String PrecioJSON(ArrayList<Precio> listado) {
        Gson gson = new Gson();
        String PrecioJSON = gson.toJson(listado);
        return PrecioJSON;
    }
}
