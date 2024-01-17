public class Habitacion {
    String idHabitacion;
    String tipoHabitacion;
    float preciobase;
    boolean disponibilidad;
    int capacidadMaxima;

    public Habitacion(String idHabitacion, String tipoHabitacion, float preciobase, boolean disponibilidad, int capacidadMaxima) {
        this.idHabitacion = idHabitacion;
        this.tipoHabitacion = tipoHabitacion;
        this.preciobase = preciobase;
        this.disponibilidad = disponibilidad;
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipoHabitacion() {
        return tipoHabitacion;
    }

    public float getPreciobase() {
        return preciobase;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
}
