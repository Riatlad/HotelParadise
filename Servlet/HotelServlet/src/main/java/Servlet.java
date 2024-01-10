 import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        Controlador.getSingleton();

        String cadenaPrueba = request.getParameter("peticion");
        String nombre =request.getParameter("nombre");
        String apellidos = request.getParameter("apellidos");

        response.setContentType("text/html;charset=UTF-8");

        String respuesta="";

        if (cadenaPrueba != null) {  // Verificar si cadenaPrueba no es null
            switch(cadenaPrueba) {
                case "Holamundo":
                    respuesta="Petición recibida con éxito... HOLA MUNDO!!!";
                    break;
                case "select":
                    respuesta=Controlador.getSingleton().hacerPrueba();
                    break;
                case "insert":
                    respuesta=Controlador.getSingleton().hacerInsert(nombre, apellidos);
                    break;
                default:
                    respuesta="Conexión realizada, el parámetro "+cadenaPrueba+" es desconocido...";
                    break;
            }
        } else {
            respuesta = "El parámetro 'peticion' es null.";
        }

        try (PrintWriter out = response.getWriter()) {
            out.print("<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n" +
                    "<title>Probando...</title>\n" +
                    "<meta charset=\"UTF-8\">\n" +
                    "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                    "</head>\n" +
                    "<body><p>Resultado de la petición:</p>\n" +
                    respuesta +
                    "</body>\n" +
                    "</html>");
        }
    }
}

