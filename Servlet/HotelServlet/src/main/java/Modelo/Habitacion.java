package Modelo;

public class Habitacion {
    String idHabitacion;
    String tipoHabitacion;
    String preciobase;
    String estado;
    String capacidadAdultos;
    String capacidadNinios;

    public Habitacion(String idHabitacion,String capacidadAdultos, String estado, String capacidadNinios, String tipoHabitacion, String preciobase ) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.preciobase = preciobase;
        this.estado = estado;
        this.capacidadAdultos = capacidadAdultos;
        this.capacidadNinios = capacidadNinios;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public String getPreciobase() {
        return preciobase;
    }

    public String getEstado() {
        return estado;
    }

    public String getCapacidadAdultos() {
        return capacidadAdultos;
    }

    public String getCapacidadNinios() {
        return capacidadNinios;
    }
}
