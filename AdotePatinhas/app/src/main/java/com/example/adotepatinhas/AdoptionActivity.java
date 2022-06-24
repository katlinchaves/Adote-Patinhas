package com.example.adotepatinhas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AdoptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption);

        TextView adotar1 = (TextView) findViewById(R.id.btnAdotar1);
        TextView adotar2 = (TextView) findViewById(R.id.btnAdotar2);
        TextView adotar3 = (TextView) findViewById(R.id.btnAdotar3);
        TextView adotar4 = (TextView) findViewById(R.id.btnAdotar4);
        TextView adotar5 = (TextView) findViewById(R.id.btnAdotar5);
        TextView adotar6 = (TextView) findViewById(R.id.btnAdotar6);

        adotar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

        adotar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

        adotar3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

        adotar4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

        adotar5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

        adotar6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilOngActivity.class);
                startActivity(i);
            }
        });

        // BOTÕES DE MENU

        TextView abrirMain = (TextView) findViewById(R.id.btnMain);

        abrirMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        TextView abrirOngs = (TextView) findViewById(R.id.btnOngs);

        abrirOngs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, OngsActivity.class);
                startActivity(i);
            }
        });

        TextView abrirPerfil = (TextView) findViewById(R.id.btnPerfil);

        abrirPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(AdoptionActivity.this, PerfilActivity.class);
                startActivity(i);
            }
        });
    }
}
