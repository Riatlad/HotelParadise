package com.HotelParadise.App.Control;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.HotelParadise.App.R;

import java.util.ArrayList;

public class VistaClienteActivity extends Activity {

    private RecyclerView listaClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_cliente_activity);

        listaClientes = findViewById(R.id.listaClientes);
    }

    public void cargarDatos(ArrayList<Cliente> clientes) {
        ClienteAdapter adapter = new ClienteAdapter(clientes);
        listaClientes.setLayoutManager(new LinearLayoutManager(this));
        listaClientes.setAdapter(adapter);
    }
}