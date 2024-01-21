import static org.junit.Assert.*;

public class HabitacionTest {



    @org.junit.Test
    public void getIdHabitacion() {
        Habitacion habitacion=new Habitacion("1","suit","ocupada","5");
        String resultado=habitacion.getIdHabitacion();
        //assertEquals("2",resultado);//Mal aposta y da la prueba mal funciona bien
        assertEquals("1",resultado);
    }

    @org.junit.Test
    public void getTipoHabitacion() {
        Habitacion habitacion=new Habitacion("1","suit","ocupada","5");
        String resultado=habitacion.getTipoHabitacion();
        //assertEquals("normal",resultado);//Mal aposta y da la prueba mal funciona bien
        assertEquals("suit",resultado);
    }

    @org.junit.Test
    public void getEstado() {
        Habitacion habitacion=new Habitacion("1","suit","ocupada","5");
        String resultado=habitacion.getEstado();
        //assertEquals("libre",resultado);//Mal aposta y da la prueba mal funciona bien
        assertEquals("ocupada",resultado);
    }

    @org.junit.Test
    public void getCapacidadMaxima() {
        Habitacion habitacion=new Habitacion("1","suit","ocupada","5");
        String resultado=habitacion.getCapacidadMaxima();
        //assertEquals("2",resultado);//Mal aposta y da la prueba mal funciona bien
        assertEquals("5",resultado);
    }
}