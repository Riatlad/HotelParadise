import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//Documentación usada: https://www.vogella.com/tutorials/JUnit4/article.html
public class RespuestaTest {
    private Respuesta respuesta;

    @Before
    public void setUp() throws Exception {
        respuesta = new Respuesta();
    }

    @Test
    public void testClientesJSON() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan", "Perez", "juan.perez@email.com", "123456789", "Calle A, 123", "12345678A", "1234-5678-9012-3456"));
        clientes.add(new Cliente("Maria", "Gomez", "maria.gomez@email.com", "987654321", "Calle B, 456", "87654321B", "5678-9012-3456-7890"));
        clientes.add(new Cliente("Carlos", "Rodriguez", "carlos.rodriguez@email.com", "654321987", "Calle C, 789", "54321678C", "9876-5432-1098-7654"));

        String jsonPrueba = "{\"nombre\":\"Juan\",\"apellidos\":\"Perez\",\"email\":\"juan.perez@email.com\",\"telefono\":\"123456789\",\"direccion\":\"Calle A, 123\",\"DNI\":\"12345678A\",\"numTarjetaCredito\":\"1234-5678-9012-3456\"}{\"nombre\":\"Maria\",\"apellidos\":\"Gomez\",\"email\":\"maria.gomez@email.com\",\"telefono\":\"987654321\",\"direccion\":\"Calle B, 456\",\"DNI\":\"87654321B\",\"numTarjetaCredito\":\"5678-9012-3456-7890\"}{\"nombre\":\"Carlos\",\"apellidos\":\"Rodriguez\",\"email\":\"carlos.rodriguez@email.com\",\"telefono\":\"654321987\",\"direccion\":\"Calle C, 789\",\"DNI\":\"54321678C\",\"numTarjetaCredito\":\"9876-5432-1098-7654\"}";
        Assert.assertEquals(jsonPrueba, respuesta.clientesJSON(clientes));
    }

    @Test
    public void testHabitacionesJSON() {
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion("H101", "Doble", "Disponible", "2"));
        habitaciones.add(new Habitacion("H202", "Individual", "Ocupada", "1"));
        habitaciones.add(new Habitacion("H305", "Suite", "Mantenimiento", "3"));

        String jsonPrueba = "{\"idHabitacion\":\"H101\",\"tipoHabitacion\":\"Doble\",\"estado\":\"Disponible\",\"capacidadMaxima\":\"2\"}{\"idHabitacion\":\"H202\",\"tipoHabitacion\":\"Individual\",\"estado\":\"Ocupada\",\"capacidadMaxima\":\"1\"}{\"idHabitacion\":\"H305\",\"tipoHabitacion\":\"Suite\",\"estado\":\"Mantenimiento\",\"capacidadMaxima\":\"3\"}";
        Assert.assertEquals(jsonPrueba, respuesta.habitacionesJSON(habitaciones));
    }
}
