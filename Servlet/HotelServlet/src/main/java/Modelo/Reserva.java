package Modelo;

public class Reserva {
    private String idReserva;
    private String idHabitacion;
    private String DNICliente;
    private String nAdultos;
    private String nNinios;
    private String acomodacion;
    private String fechaFin;
    private String fechaInicio;

    public Reserva(String idReserva, String idHabitacion, String DNICliente, String nAdultos, String nNinios, String acomodacion, String fechaFin, String fechaInicio) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.DNICliente = DNICliente;
        this.nAdultos = nAdultos;
        this.nNinios = nNinios;
        this.acomodacion = acomodacion;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaInicio;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public String getIdHabitacion() {
        return idHabitacion;
    }

    public String getDNICliente() {
        return DNICliente;
    }

    public String getnAdultos() {
        return nAdultos;
    }

    public String getnNinios() {
        return nNinios;
    }

    public String getAcomodacion() {
        return acomodacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }
}
