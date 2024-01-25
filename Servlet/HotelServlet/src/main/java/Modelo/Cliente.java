package Modelo;

public class Cliente {
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String direccion;
    private String DNI;
    private String numTarjetaCredito;
    private String user;
    private String passwd;

    public Cliente(String nombre, String apellidos, String email, String telefono, String direccion, String DNI, String numTarjetaCredito,String user, String passwd) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.DNI = DNI;
        this.numTarjetaCredito = numTarjetaCredito;
        this.user=user;
        this.passwd=passwd;
    }


    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNumTarjetaCredito() {
        return numTarjetaCredito;
    }

    public String getUser() {
        return user;
    }

    public String getPasswd() {
        return passwd;
    }
}
