package Modelo;

import Modelo.Cliente;
import Modelo.Habitacion;
import com.google.gson.Gson;

import java.util.List;

public class Respuesta {

    public String clientesJSON(List<Cliente> clientes) {
        StringBuilder clientesJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < clientes.size(); i++) {
            clientesJSON.append(gson.toJson(clientes.get(i)));
        }

        System.out.println(clientesJSON);
        return clientesJSON.toString();
    }

    public String habitacionesJSON(List<Habitacion> habitaciones) {
        StringBuilder habitacionesJSON = new StringBuilder();
        Gson gson = new Gson();

        for (int i = 0; i < habitaciones.size(); i++) {
            habitacionesJSON.append(gson.toJson(habitaciones.get(i)));
        }

        return habitacionesJSON.toString();
    }
}
