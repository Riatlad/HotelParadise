package Modelo;

public class Precio {
    private String nombre;
    private String valor;

    public Precio(String nombre, String valor) {
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
