package Modelo;

import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class HabitacionTest {
    private static Habitacion habitacion;
    @BeforeClass
    public static void inicializar(){
        habitacion=new Habitacion("1","2","libre","0","suit"
        ,"50");
    }

    @org.junit.Test
    public void getIdHabitacion() {
        assertEquals(habitacion.getIdHabitacion(),"2");//Mal aposta
        assertEquals(habitacion.getIdHabitacion(),"1");
    }

    @org.junit.Test
    public void getTipoHabitacion() {
        assertEquals(habitacion.getTipoHabitacion(),"normal");//Mal aposta
        assertEquals(habitacion.getTipoHabitacion(),"suit");
    }

    @org.junit.Test
    public void getPreciobase() {
        assertEquals(habitacion.getPreciobase(),"20");//Mal aposta
        assertEquals(habitacion.getPreciobase(),"50");
    }

    @org.junit.Test
    public void getEstado() {
        assertEquals(habitacion.getEstado(),"ocupado");//Mal aposta
        assertEquals(habitacion.getEstado(),"libre");
    }

    @org.junit.Test
    public void getCapacidadAdultos() {
        assertEquals(habitacion.getCapacidadAdultos(),"1");//Mal aposta
        assertEquals(habitacion.getCapacidadAdultos(),"2");
    }

    @org.junit.Test
    public void getCapacidadNinios() {
        assertEquals(habitacion.getCapacidadNinios(),"1");//Mal aposta
        assertEquals(habitacion.getCapacidadNinios(),"0");
    }
}