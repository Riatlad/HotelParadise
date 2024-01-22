package Modelo;

public class Suplemento {
    private String nombre;
    private String valor;

    public Suplemento(String nombre, String valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public String getValor() {
        return valor;
    }
}
