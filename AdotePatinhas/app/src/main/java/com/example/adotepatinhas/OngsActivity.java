package com.example.adotepatinhas;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class OngsActivity extends AppCompatActivity {

    private Spinner spinner_estados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongs);

        TextView adotar1 = (TextView) findViewById(R.id.btnAdotar1);
        TextView adotar2 = (TextView) findViewById(R.id.btnAdotar2);
        TextView adotar3 = (TextView) findViewById(R.id.btnAdotar3);
        TextView adotar4 = (TextView) findViewById(R.id.btnAdotar4);
        TextView adotar5 = (TextView) findViewById(R.id.btnAdotar5);
        TextView adotar6 = (TextView) findViewById(R.id.btnAdotar6);
        TextView adotar7 = (TextView) findViewById(R.id.btnAdotar7);
        TextView adotar8 = (TextView) findViewById(R.id.btnAdotar8);

        adotar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        adotar8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        // BOTÕES DE MENU

        TextView abrirMain = (TextView) findViewById(R.id.btnMain);

        abrirMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        TextView abrirAdote = (TextView) findViewById(R.id.btnAdote);

        abrirAdote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, AdoptionActivity.class);
                startActivity(i);
            }
        });

        TextView abrirPerfil = (TextView) findViewById(R.id.btnPerfil);

        abrirPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(OngsActivity.this, PerfilActivity.class);
                startActivity(i);
            }
        });

    }
}
