package Modelo;

import com.google.gson.Gson;

import java.util.List;

public class Respuesta {
    private Gson gson;

    public String clientesJSON(List<Cliente> clientes) {
        gson = new Gson();
        return gson.toJson(clientes);
    }

    public String habitacionesJSON(List<Habitacion> habitaciones) {
        gson = new Gson();
        return gson.toJson(habitaciones);
    }

    public String reservaJSON(List<Reserva> reservas) {
        gson = new Gson();
        return gson.toJson(reservas);
    }

    public String suplementosJSON(List<Suplemento> suplementos) {
        gson = new Gson();
        return gson.toJson(suplementos);
    }

    public String PrecioJSON(List<Precio> precios) {
        gson = new Gson();
        return gson.toJson(precios);
    }
}
