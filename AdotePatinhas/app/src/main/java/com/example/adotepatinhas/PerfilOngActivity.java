package com.example.adotepatinhas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PerfilOngActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_ong);

        // BOTÕES DE MENU

        TextView abrirMain = (TextView) findViewById(R.id.btnMain);

        abrirMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilOngActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        TextView abrirAdote = (TextView) findViewById(R.id.btnAdote);

        abrirAdote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilOngActivity.this, AdoptionActivity.class);
                startActivity(i);
            }
        });

        TextView abrirOngs = (TextView) findViewById(R.id.btnOngs);

        abrirOngs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilOngActivity.this, OngsActivity.class);
                startActivity(i);
            }
        });

        TextView abrirPerfil = (TextView) findViewById(R.id.btnPerfil);

        abrirPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilOngActivity.this, PerfilActivity.class);
                startActivity(i);
            }
        });
    }
}
