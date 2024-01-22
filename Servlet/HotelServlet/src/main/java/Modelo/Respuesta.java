package Modelo;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class Respuesta {

    public String clientesJSON(List<Cliente> listado) {
        StringBuilder clientesJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < listado.size(); i++) {
            clientesJSON.append(gson.toJson(listado.get(i)));
        }

        return clientesJSON.toString();
    }

    public String habitacionesJSON(List<Habitacion> listado) {
        StringBuilder habitacionesJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < listado.size(); i++) {
            habitacionesJSON.append(gson.toJson(listado.get(i)));
        }

        return habitacionesJSON.toString();
    }

    public String reservaJSON(ArrayList<Reserva> listado) {
        StringBuilder reservasJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < listado.size(); i++) {
            reservasJSON.append(gson.toJson(listado.get(i)));
        }

        return reservasJSON.toString();
    }

    public String suplementosJSON(ArrayList<Suplemento> listado) {
        StringBuilder suplementosJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < listado.size(); i++) {
            suplementosJSON.append(gson.toJson(listado.get(i)));
        }

        return suplementosJSON.toString();
    }

    public String PrecioJSON(ArrayList<Precio> listado) {
        StringBuilder preciosJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < listado.size(); i++) {
            preciosJSON.append(gson.toJson(listado.get(i)));
        }

        return preciosJSON.toString();
    }
}
