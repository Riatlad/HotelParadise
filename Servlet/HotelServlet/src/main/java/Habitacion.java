public class Habitacion {
    private String idHabitacion;
    private String tipoHabitacion;
    private String estado;
    private String capacidadMaxima;

    public Habitacion(String idHabitacion, String tipoHabitacion, String estado, String capacidadMaxima) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.estado=estado;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public String getEstado() {
        return estado;
    }

    public String getCapacidadMaxima() {
        return capacidadMaxima;
    }
}
