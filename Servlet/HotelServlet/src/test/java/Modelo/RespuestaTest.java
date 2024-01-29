package Modelo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

//Documentación usada: https://www.vogella.com/tutorials/JUnit4/article.html
public class RespuestaTest {
    private Respuesta respuesta;

    @Before
    public void setUp() {
        respuesta = new Respuesta();
    }

    @Test
    public void testClientesJSON() {
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Juan", "Perez", "juan.perez@email.com", "123456789", "Calle A, 123", "12345678A", "1234-5678-9012-3456", "juan_user", "juan_passwd"));
        clientes.add(new Cliente("Maria", "Gomez", "maria.gomez@email.com", "987654321", "Calle B, 456", "87654321B", "5678-9012-3456-7890", "maria_user", "maria_passwd"));
        clientes.add(new Cliente("Carlos", "Rodriguez", "carlos.rodriguez@email.com", "654321987", "Calle C, 789", "54321678C", "9876-5432-1098-7654", "carlos_user", "carlos_passwd"));

        String jsonPrueba = "[{\"nombre\":\"Juan\",\"apellidos\":\"Perez\",\"email\":\"juan.perez@email.com\",\"telefono\":\"123456789\",\"direccion\":\"Calle A, 123\",\"DNI\":\"12345678A\",\"numTarjetaCredito\":\"1234-5678-9012-3456\",\"user\":\"juan_user\",\"passwd\":\"juan_passwd\"},{\"nombre\":\"Maria\",\"apellidos\":\"Gomez\",\"email\":\"maria.gomez@email.com\",\"telefono\":\"987654321\",\"direccion\":\"Calle B, 456\",\"DNI\":\"87654321B\",\"numTarjetaCredito\":\"5678-9012-3456-7890\",\"user\":\"maria_user\",\"passwd\":\"maria_passwd\"},{\"nombre\":\"Carlos\",\"apellidos\":\"Rodriguez\",\"email\":\"carlos.rodriguez@email.com\",\"telefono\":\"654321987\",\"direccion\":\"Calle C, 789\",\"DNI\":\"54321678C\",\"numTarjetaCredito\":\"9876-5432-1098-7654\",\"user\":\"carlos_user\",\"passwd\":\"carlos_passwd\"}]";
        Assert.assertEquals(jsonPrueba, respuesta.clientesJSON(clientes));
    }

    @Test
    public void testHabitacionesJSON() {
        List<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion("H101", "2", "Disponible", "0", "Doble", "100.00"));
        habitaciones.add(new Habitacion("H202", "1", "Ocupada", "1", "Individual", "80.00"));
        habitaciones.add(new Habitacion("H305", "3", "Mantenimiento", "1", "Suite", "150.00"));

        String jsonPrueba = "[{\"idHabitacion\":\"H101\",\"tipoHabitacion\":\"Doble\",\"preciobase\":\"100.00\",\"estado\":\"Disponible\",\"capacidadAdultos\":\"2\",\"capacidadNinios\":\"0\"},{\"idHabitacion\":\"H202\",\"tipoHabitacion\":\"Individual\",\"preciobase\":\"80.00\",\"estado\":\"Ocupada\",\"capacidadAdultos\":\"1\",\"capacidadNinios\":\"1\"},{\"idHabitacion\":\"H305\",\"tipoHabitacion\":\"Suite\",\"preciobase\":\"150.00\",\"estado\":\"Mantenimiento\",\"capacidadAdultos\":\"3\",\"capacidadNinios\":\"1\"}]";
        Assert.assertEquals(jsonPrueba, respuesta.habitacionesJSON(habitaciones));
    }

    @Test
    public void testReservaJSON() {
        List<Reserva> reservas = new ArrayList<>();
        reservas.add(new Reserva("R001", "H101", "12345678A", "2", "0", "Doble", "2024-02-10", "2024-02-15"));
        reservas.add(new Reserva("R002", "H202", "87654321B", "1", "1", "Individual", "2024-03-05", "2024-03-10"));
        reservas.add(new Reserva("R003", "H305", "54321678C", "2", "1", "Suite", "2024-04-20", "2024-04-25"));

        String jsonPrueba = "[{\"idReserva\":\"R001\",\"idHabitacion\":\"H101\",\"DNICliente\":\"12345678A\",\"nAdultos\":\"2\",\"nNinios\":\"0\",\"acomodacion\":\"Doble\",\"fechaFin\":\"2024-02-10\",\"fechaInicio\":\"2024-02-15\"},{\"idReserva\":\"R002\",\"idHabitacion\":\"H202\",\"DNICliente\":\"87654321B\",\"nAdultos\":\"1\",\"nNinios\":\"1\",\"acomodacion\":\"Individual\",\"fechaFin\":\"2024-03-05\",\"fechaInicio\":\"2024-03-10\"},{\"idReserva\":\"R003\",\"idHabitacion\":\"H305\",\"DNICliente\":\"54321678C\",\"nAdultos\":\"2\",\"nNinios\":\"1\",\"acomodacion\":\"Suite\",\"fechaFin\":\"2024-04-20\",\"fechaInicio\":\"2024-04-25\"}]";
        Assert.assertEquals(jsonPrueba, respuesta.reservaJSON(reservas));
    }

    @Test
    public void testSuplementosJSON() {
        List<Suplemento> suplementos = new ArrayList<>();
        suplementos.add(new Suplemento("Desayuno", "10.00"));
        suplementos.add(new Suplemento("Wifi", "5.00"));
        suplementos.add(new Suplemento("Estacionamiento", "15.00"));

        String jsonPrueba = "[{\"nombre\":\"Desayuno\",\"valor\":\"10.00\"},{\"nombre\":\"Wifi\",\"valor\":\"5.00\"},{\"nombre\":\"Estacionamiento\",\"valor\":\"15.00\"}]";
        Assert.assertEquals(jsonPrueba, respuesta.suplementosJSON(suplementos));
    }

    @Test
    public void testPrecioJSON() {
        List<Precio> precios = new ArrayList<>();
        precios.add(new Precio("Noche Regular", "100.00"));
        precios.add(new Precio("Fin de Semana", "120.00"));
        precios.add(new Precio("Temporada Alta", "150.00"));

        String jsonPrueba = "[{\"nombre\":\"Noche Regular\",\"valor\":\"100.00\"},{\"nombre\":\"Fin de Semana\",\"valor\":\"120.00\"},{\"nombre\":\"Temporada Alta\",\"valor\":\"150.00\"}]";
        Assert.assertEquals(jsonPrueba, respuesta.PrecioJSON(precios));
    }

}
