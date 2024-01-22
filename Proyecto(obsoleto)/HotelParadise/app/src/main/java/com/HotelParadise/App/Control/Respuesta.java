package com.HotelParadise.App.Control;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Respuesta {


    public List<Cliente> parsearClientes(String json) {

        LinkedList<Cliente> dataCliente = new LinkedList<>();

        JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement cliente = jsonArray.get(i);
            dataCliente.add(new Cliente(
                    cliente.getAsJsonObject().get("idCliente").getAsString(),
                    cliente.getAsJsonObject().get("nombre").getAsString(),
                    cliente.getAsJsonObject().get("apellidos").getAsString(),
                    cliente.getAsJsonObject().get("email").getAsString(),
                    cliente.getAsJsonObject().get("telefono").getAsString(),
                    cliente.getAsJsonObject().get("direccion").getAsString(),
                    cliente.getAsJsonObject().get("DNI").getAsString(),
                    cliente.getAsJsonObject().get("numTarjetaCredito").getAsString()
            ));
        }

        return dataCliente;
    }

    public List<Habitacion> parsearHabitaciones(String json) {

        LinkedList<Habitacion> dataHabitacion = new LinkedList<>();

        JsonArray jsonArray = JsonParser.parseString(json).getAsJsonArray();

        for (int i = 0; i < jsonArray.size(); i++) {
            JsonElement habitacion = jsonArray.get(i);
            dataHabitacion.add(new Habitacion(
                    habitacion.getAsJsonObject().get("idHabitacion").getAsString(),
                    habitacion.getAsJsonObject().get("tipoHabitacion").getAsString(),
                    habitacion.getAsJsonObject().get("preciobase").getAsFloat(),
                    habitacion.getAsJsonObject().get("disponibilidad").getAsBoolean(),
                    habitacion.getAsJsonObject().get("capacidadMaxima").getAsInt()
            ));
        }

        return dataHabitacion;
    }
}
