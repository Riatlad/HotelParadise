import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class ConexionBD {
    private Connection conexion;
    private ResultSet rs;
    private Statement st;
    private Respuesta respuesta;

    public ConexionBD() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
            respuesta = new Respuesta();
            DriverManager.registerDriver(new org.postgresql.Driver());
            this.conexion = DriverManager.getConnection("jdbc:postgresql://db:5432/hotelparadise?user=postgres&password=mipassword");
            if (conexion != null) {
                System.out.print("Conexion realizada");
            }
        } catch (SQLException error) {
            System.out.println(error);
            error.printStackTrace();
        }
    }

    public String selectCliente() {
        String texto="";
        try {
            ArrayList<Cliente> clientes = new ArrayList<>();
            if (conexion != null)
                return "NO HAY CONEXIÓN CON LA BASE DE DATOS";
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                String dni = rs.getString("dni");
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String telefono = rs.getString("telefono");
                String dir_postal = rs.getString("dir_postal");
                String num_credito = rs.getString("num_credito");
                String email = rs.getString("email");
                Cliente nuevoCliente = new Cliente(nombre, apellidos, email, telefono, dir_postal, dni, num_credito);
                clientes.add(nuevoCliente);
            }
            texto = respuesta.clientesJSON(clientes);
            return texto;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return texto;
    }
    public String selectHabitacion() {
        String texto="";
        try {
            ArrayList<Habitacion> habitaciones = new ArrayList<>();
            if (conexion != null)
                return "NO HAY CONEXIÓN CON LA BASE DE DATOS";
            st = conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM habitaciones");
            while (rs.next()) {
                String capacidad_adultos = rs.getString("Capacidad_adultos");
                String tipo = rs.getString("tipo");
                String estado = rs.getString("estado");
                String id_hab = rs.getString("id_hab");
                Habitacion nuevaHabitacion = new Habitacion(id_hab, tipo, estado, capacidad_adultos);
                habitaciones.add(nuevaHabitacion);
            }
            texto = respuesta.habitacionesJSON(habitaciones);
            return texto;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return texto;
    }
/*
    public ArrayList<PruebasHotel> hacerSelectPrueba() {
        ArrayList<PruebasHotel> listado = new ArrayList<>();
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM prueba");
            while (rs.next()) {
                String nombre = rs.getString(1);
                String apellidos = rs.getString(2);
                PruebasHotel alumno = new PruebasHotel(nombre, apellidos);
                listado.add(alumno);
            }
            return listado;
        } catch (SQLException error) {
            PruebasHotel errorazo=new PruebasHotel("Error", "errorazo");
            listado.add(errorazo);
            return listado;
        }
    }

    public String insertarAlumno(String nombre, String apellidos) {
        try {
            Statement insert = conexion.createStatement();
            insert.executeUpdate("INSERT INTO prueba (nombre, apellidos) VALUES ('" + nombre + "', '" + apellidos + "')");
            return "Inserción exitosa";
        } catch (SQLException error) {
            return "error";
        }
    }*/
}
