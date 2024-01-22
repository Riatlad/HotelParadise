package Controlador;

import Modelo.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConexionBD {
    private Connection conexion;
    private Respuesta respuesta;
    public ConexionBD() {
        respuesta = new Respuesta();
        try {
            if (conexion != null && !conexion.isClosed()) {
                conexion.close();
            }
            DriverManager.registerDriver(new org.postgresql.Driver());
            this.conexion = DriverManager.getConnection("jdbc:postgresql://db:5432/pruebashotel?user=postgres&password=mipassword");
            if (conexion != null) {
                System.out.print("Conexion realizada 1");
            }
        } catch (SQLException error) {
            System.out.println(error);
            error.printStackTrace();
        }
    }
    public String hacerSelectClientes() {
        ArrayList<Cliente> listado = new ArrayList<>();
        String json="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM cliente");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellidos = rs.getString("apellidos");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");
                String direccion = rs.getString("direccion");
                String DNI = rs.getString("dni");
                String numTarjetaCredito = rs.getString("numcredito");
                String user = rs.getString("usuario");
                String passwd = rs.getString("contrasena");


                Cliente cliente = new Cliente(nombre, apellidos,email,telefono,direccion,DNI,numTarjetaCredito,user,passwd);
                listado.add(cliente);
            }
            json = respuesta.clientesJSON(listado);
        } catch (SQLException error) {
            error.printStackTrace();
        }

        return json;
    }
    public String hacerSelectHabitacion() {
        ArrayList<Habitacion> listado = new ArrayList<>();
        String json="";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM habitacion");
            while (rs.next()) {
                String idhab = rs.getString("id_hab");
                String cap_adultos = rs.getString("cap_adultos");
                String cap_ninos = rs.getString("cap_ninos");
                String estado = rs.getString("estado");
                String tipo = rs.getString("tipo");
                String preciobase = rs.getString("preciobase");



                Habitacion habitacion = new Habitacion(idhab, cap_adultos,cap_ninos,estado,tipo,preciobase);
                listado.add(habitacion);

            }
            json = respuesta.habitacionesJSON(listado);
        } catch (SQLException error) {
            error.printStackTrace();

        }
        return json;
    }
    public String hacerSelectPrecio() {

        ArrayList<Precio> listado = new ArrayList<>();
        String json="";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM precio");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String valor = rs.getString("valor");



                Precio precio = new Precio(nombre, valor);
                listado.add(precio);

            }
            json = respuesta.PrecioJSON(listado);
        } catch (SQLException error) {
            error.printStackTrace();

        }
        return json;
    }

    public String hacerSelectSuplementos() {
        ArrayList<Suplemento> listado = new ArrayList<>();
        String json="";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM suplementos");
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String valor = rs.getString("valor");



                Suplemento sup = new Suplemento(nombre, valor);
                listado.add(sup);

            }
            json = respuesta.suplementosJSON(listado);
        } catch (SQLException error) {
            error.printStackTrace();

        }
        return json;
    }
    public String hacerSelectReserva() {
        ArrayList<Reserva> listado = new ArrayList<>();
        String json="";

        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM reserva");
            while (rs.next()) {
                String idReserva = rs.getString("num_reserva");
                String idHabitacion = rs.getString("num_habitacion");
                String DNI = rs.getString("dni_cliente");
                String nAdultos = rs.getString("num_adultos");
                String nNinios = rs.getString("num_ninos");
                String acomodacion = rs.getString("acomodacion");
                String fechaFin = rs.getString("fecha_fin");
                String fechaInicio = rs.getString("fecha_inicio");




                Reserva reserva = new Reserva(idReserva, idHabitacion, DNI,nAdultos ,nNinios ,acomodacion ,fechaFin,fechaInicio);
                listado.add(reserva);

            }
            json=respuesta.reservaJSON(listado);
        } catch (SQLException error) {
            error.printStackTrace();

        }
        return json;
    }

/*

    //COMO HACER LOS INSERTS:
    public String insertarCliente(String nombre, String apellidos) {
        try {
            Statement insert = conexion.createStatement();
            insert.executeUpdate("INSERT INTO prueba (nombre, apellidos) VALUES ('" + nombre + "', '" + apellidos + "')");
            return "Inserción exitosa";
        } catch (SQLException error) {
            return "error";
        }
    }





    //Esto es de la anterior base de datos/anteriores commits



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
    */



}

