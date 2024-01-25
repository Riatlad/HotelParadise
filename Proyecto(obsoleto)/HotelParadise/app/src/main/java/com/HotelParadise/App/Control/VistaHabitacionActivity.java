package com.HotelParadise.App.Control;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.R;
import com.politecnicomalaga.hotel.Control.HabitacionViewAdapter;

import java.util.ArrayList;
import java.util.LinkedList;

public class VistaHabitacionActivity extends Activity {

    private RecyclerView listaHabitaciones;
    private HabitacionViewAdapter miAdapter;
    LinkedList<Habitacion> mList=new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_habitacion_activity);

        listaHabitaciones = findViewById(R.id.listaHabitaciones);

        miAdapter = new HabitacionViewAdapter(this, mList);

        listaHabitaciones.setAdapter(miAdapter);

        listaHabitaciones.setLayoutManager(new LinearLayoutManager(this));
    }

    private void cargarDatos(ArrayList<Habitacion> habitaciones) {
        HabitacionAdapter adapter = new HabitacionAdapter(habitaciones);
        listaHabitaciones.setLayoutManager(new LinearLayoutManager(this));
        listaHabitaciones.setAdapter(adapter);
    }
}