package Controlador;

import Modelo.*;

import java.util.ArrayList;

public class Controlador {
    private static Controlador singleton;
    private ConexionBD conectar;

    private Controlador() {
        conectar = new ConexionBD();
    }
    public static Controlador getSingleton() {
        if (Controlador.singleton == null) {
            singleton = new Controlador();
        }
        return singleton;
    }
/* Esto es de la anterior base de datos
   public String hacerPrueba() {
        ArrayList<PruebasHotel> lista = conectar.hacerSelectPrueba();
        String respuesta="<p>Listado de participantes:</p>\n";
        String respuestaBucle="";
        for (PruebasHotel ele: lista) {
            respuestaBucle=respuestaBucle+"<p>Nombre: "+ele.getNombre()+", apellidos: "+ele.getApellidos()+"<p>\n";
        }
        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }
    public String hacerInsert(String nombre, String apellidos) {
        String respuesta = conectar.insertarAlumno(nombre, apellidos);
        return respuesta;
    }
*/
    public String obtenerClientes() {
        ArrayList<Cliente> lista = conectar.hacerSelectClientes();
        String respuesta="<p>Listado de clientes:</p>\n";
        String respuestaBucle="";
        for (Cliente ele: lista) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                        "DNI: " + ele.getDNI()+ " Nombre: "+ele.getNombre()+" Apellidos: "+ele.getApellidos()+" Email: "+ele.getEmail()+
                        " Teléfono: "+ele.getTelefono()+" Dirección: "+ele.getDireccion()+" Tarjeta de Crédito: "+ele.getNumTarjetaCredito()+
                        " Usuario: "+ele.getUser()+" Contraseña: "+ele.getPasswd()+

                    "<p>\n";
        }
        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }

    public String obtenerHabitaciones() {
        ArrayList<Habitacion> lista = conectar.hacerSelectHabitacion();
        String respuesta="<p>Listado de Habitaciones:</p>\n";
        String respuestaBucle="";
        for (Habitacion ele: lista) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "IdHabitación: " + ele.getIdHabitacion()+ " Capacidad adultos: "+ele.getCapacidadAdultos()+" Capacidad niños: "+ele.getCapacidadNinios()+
                    " Estado: "+ele.getEstado()+" Tipo: "+ele.getTipoHabitacion()+ " PrecioBase: " + ele.getPreciobase()+

                    "<p>\n";
        }
        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }
    public String obtenerReservas() {
        ArrayList<Reserva> lista = conectar.hacerSelectReserva();
        String respuesta="<p>Listado de Reservas:</p>\n";
        String respuestaBucle="";
        for (Reserva ele: lista) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "IdReserva: " + ele.getIdReserva() + " IdHabitacion: " + ele.getIdHabitacion() + " DNI Cliente: " + ele.getDNICliente()+
                    " Número de Adultos: " + ele.getnAdultos() + "Número de niños: " + ele.getnNinios() + " Tipo de Acomodación: " + ele.getAcomodacion() +
                    " Fecha Inicio: " + ele.getFechaInicio() + " Fecha Fin: " + ele.getFechaFin() +

                    "<p>\n";
        }
        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }
    public String obtenerPrecio() {
        ArrayList<Precio> lista = conectar.hacerSelectPrecio();
        String respuesta="<p>Listado de Precios:</p>\n";
        String respuestaBucle="";
        for (Precio ele: lista) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "Nombre: " + ele.getNombre()+ " Precio: "+ele.getValor()+

                    "<p>\n";
        }
        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }

    public String obtenerSuplementos() {
        ArrayList<Suplemento> lista = conectar.hacerSelectSuplementos();
        String respuesta="<p>Listado de Suplementos:</p>\n";
        String respuestaBucle="";
        for (Suplemento ele: lista) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "Nombre: " + ele.getNombre()+ " Precio: "+ele.getValor()+

                    "<p>\n";
        }
        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }

    public String obtenerTodo() {
        ArrayList<Cliente> listaClientes = conectar.hacerSelectClientes();
        ArrayList<Habitacion> listaHabitacion = conectar.hacerSelectHabitacion();
        ArrayList<Reserva> listaReserva = conectar.hacerSelectReserva();
        ArrayList<Suplemento> listaSuplemento = conectar.hacerSelectSuplementos();
        ArrayList<Precio> listaPrecio = conectar.hacerSelectPrecio();


        String respuesta="<p>Listado de Clientes:</p>\n";
        String respuestaBucle="";

        for (Cliente ele: listaClientes) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "DNI: " + ele.getDNI()+ " Nombre: "+ele.getNombre()+" Apellidos: "+ele.getApellidos()+" Email: "+ele.getEmail()+
                    " Teléfono: "+ele.getTelefono()+" Dirección: "+ele.getDireccion()+" Tarjeta de Crédito: "+ele.getNumTarjetaCredito()+
                    " Usuario: "+ele.getUser()+" Contraseña: "+ele.getPasswd()+

                    "<p>\n";
        }

        respuesta=respuesta+respuestaBucle+"\n\n";
        respuesta+="<p>Listado de Habitaciones:</p>\n";
        respuestaBucle="";

        for (Habitacion ele: listaHabitacion) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "IdHabitación: " + ele.getIdHabitacion()+ " Capacidad adultos: "+ele.getCapacidadAdultos()+" Capacidad niños: "+ele.getCapacidadNinios()+
                    " Estado: "+ele.getEstado()+" Tipo: "+ele.getTipoHabitacion()+ " PrecioBase: " + ele.getPreciobase()+

                    "<p>\n";
        }

        respuesta=respuesta+respuestaBucle+"\n\n";
        respuesta+="<p>Listado de Reservas:</p>\n";
        respuestaBucle="";

        for (Reserva ele: listaReserva) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "IdReserva: " + ele.getIdReserva() + " IdHabitacion: " + ele.getIdHabitacion() + " DNI Cliente: " + ele.getDNICliente()+
                    " Número de Adultos: " + ele.getnAdultos() + "Número de niños: " + ele.getnNinios() + " Tipo de Acomodación: " + ele.getAcomodacion() +
                    " Fecha Inicio: " + ele.getFechaInicio() + " Fecha Fin: " + ele.getFechaFin() +

                    "<p>\n";
        }

        respuesta=respuesta+respuestaBucle+"\n\n";

        respuesta+="<p>Listado de Precios:</p>\n";
        respuestaBucle="";

        for (Precio ele: listaPrecio) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "Nombre: " + ele.getNombre()+ " Precio: "+ele.getValor()+

                    "<p>\n";
        }


        respuesta=respuesta+respuestaBucle+"\n\n";
        respuesta+="<p>Listado de Suplementos:</p>\n";
        respuestaBucle="";

        for (Suplemento ele: listaSuplemento) {
            respuestaBucle=respuestaBucle+
                    "<p>"+

                    "Nombre: " + ele.getNombre()+ " Precio: "+ele.getValor()+

                    "<p>\n";
        }




        respuesta=respuesta+respuestaBucle+ "</body>"
                + "</html>";
        return respuesta;
    }


}

