package com.example.interfazfinal;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main3Activity extends AppCompatActivity {

    ImageView Categoria;
    ImageView Contenido;
    ImageView Pagos;
    ImageView Tarifas;
    ImageView Cliente;
    ImageView Generos;
    Button lcategorias;
    Button lcontenidos;
    Button lpagos;
    Button ltarifas;
    Button lclientes;
    Button lgeneros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Categoria = findViewById(R.id.categoria);
        Contenido = findViewById(R.id.contenido);
        Pagos = findViewById(R.id.pagos);
        Tarifas = findViewById(R.id.tarifas);
        Cliente = findViewById(R.id.cliente);
        Generos = findViewById(R.id.generos);
        lcategorias = findViewById(R.id.lcategorias);
        lcontenidos = findViewById(R.id.lcontenidos);
        lpagos = findViewById(R.id.lpagos);
        ltarifas = findViewById(R.id.ltarifas);
        lclientes = findViewById(R.id.lclientes);
        lgeneros = findViewById(R.id.lgeneros);

        Categoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://necflis2021.simplesite.com/449568648");
            }
        });
        Contenido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://necflis2021.simplesite.com/449569323");
            }
        });
        Pagos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://necflis2021.simplesite.com/449569838");
            }
        });
        Tarifas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://necflis2021.simplesite.com/449569712");
            }
        });
        Cliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://necflis2021.simplesite.com/449569619");
            }
        });
        Generos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://necflis2021.simplesite.com/449569552");
            }
        });
        lcategorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://192.168.1.5:8080/categoria");
            }
        });
        lcontenidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://192.168.1.5:8080/contenido");
            }
        });
        lpagos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://192.168.1.5:8080/pagos");
            }
        });
        ltarifas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://192.168.1.5:8080/tarifas");
            }
        });
        lclientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://192.168.1.5:8080/cliente");
            }
        });
        lgeneros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("http://192.168.1.5:8080/genero");
            }
        });
    }

    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
