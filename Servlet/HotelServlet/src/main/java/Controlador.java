import java.sql.SQLException;
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
   /*
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
    public String obtenerHabitaiones() {
        return conectar.selectHabitacion();
    }
    public String obtenerClientes() {
        return conectar.selectCliente();
    }
}

