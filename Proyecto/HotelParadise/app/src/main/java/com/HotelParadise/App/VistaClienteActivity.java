package com.example.menu;

import android.app.Activity;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class VistaClienteActivity extends Activity {

    private RecyclerView listaClientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vista_cliente_activity);

        listaClientes = findViewById(R.id.listaClientes);
        cargarDatos(Singleton.getSingleton().obtenerClientes());
    }

    private void cargarDatos(ArrayList<Cliente> clientes) {
        ClienteAdapter adapter = new ClienteAdapter(clientes);
        listaClientes.setLayoutManager(new LinearLayoutManager(this));
        listaClientes.setAdapter(adapter);
    }
}