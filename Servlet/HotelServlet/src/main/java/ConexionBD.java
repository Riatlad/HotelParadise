import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

public class ConexionBD {
    private Connection conexion;
    public static int contador=0;
    private ResultSet rs;
    private Statement st;
    private Respuesta respuesta;

    public ConexionBD() {
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
            DriverManager.registerDriver(new org.postgresql.Driver());
            this.conexion = DriverManager.getConnection("jdbc:postgresql://db:5432/hotelparadise?user=postgres&password=mipassword");
            if (conexion != null) {
                System.out.print("Conexion realizada 1");
            }
        } catch (SQLException error) {
            System.out.println(error);
            error.printStackTrace();
        }
        respuesta = new Respuesta();
    }

    public String selectHabitacion() throws SQLException {
        ArrayList<Habitacion> habitaciones = new ArrayList<Habitacion>();
        if (conexion != null)
            return "NO HAY CONEXIÓN CON LA BASE DE DATOS";
        st = conexion.createStatement();
        rs = st.executeQuery("SELECT * FROM habitacion");
        while (rs.next())
            habitaciones.add(new Habitacion(rs.getString(1)));
        Respuesta.habitacionesJson(habitaciones);
        return "";
    }
    public String selectCliente() throws SQLException {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        if (conexion != null)
            return "NO HAY CONEXIÓN CON LA BASE DE DATOS";
        st = conexion.createStatement();
        rs = st.executeQuery("SELECT * FROM habitacion");
        while (rs.next())
            clientes.add(new Cliente(rs.getString(1)));
        Respuesta.clientesJson(clientes);
        return "";
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

