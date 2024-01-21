package com.example.menu;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VistaHabitacionActivity extends Activity {

    private RecyclerView listaHabitaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_habitacion_activity);

        listaHabitaciones = findViewById(R.id.listaHabitaciones);
        cargarDatos(Singleton.getSingleton().obtenerHabitaciones());
    }

    private void cargarDatos(ArrayList<Habitacion> habitaciones) {
        HabitacionAdapter adapter = new HabitacionAdapter(habitaciones);
        listaHabitaciones.setLayoutManager(new LinearLayoutManager(this));
        listaHabitaciones.setAdapter(adapter);
    }
}