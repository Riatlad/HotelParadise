public class Cliente {
    private String idCliente;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    private String direccion;
    private String DNI;
    private String numTarjetaCredito;

    public Cliente(String idCliente, String nombre, String apellidos, String email, String telefono, String direccion, String DNI, String numTarjetaCredito) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.DNI = DNI;
        this.numTarjetaCredito = numTarjetaCredito;
    }

    public String getIdCliente() {
        return idCliente;
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
}
