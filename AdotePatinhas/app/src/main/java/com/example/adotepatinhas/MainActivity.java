package com.example.adotepatinhas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView blog = (TextView) findViewById(R.id.txtBlog);

        blog.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, BlogActivity.class);
                startActivity(i);
            }
        });

        TextView adotar1 = (TextView) findViewById(R.id.btnAdotar1);
        TextView adotar2 = (TextView) findViewById(R.id.btnAdotar2);

        adotar1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

        adotar2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PerfilPetActivity.class);
                startActivity(i);
            }
        });

// BOTÕES DE MENU

        TextView abrirAdote = (TextView) findViewById(R.id.btnAdote);

        abrirAdote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, AdoptionActivity.class);
               startActivity(i);
            }
        });

        TextView abrirOngs = (TextView) findViewById(R.id.btnOngs);

        abrirOngs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, OngsActivity.class);
                startActivity(i);
            }
        });

        TextView abrirPerfil = (TextView) findViewById(R.id.btnPerfil);

        abrirPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PerfilActivity.class);
                startActivity(i);
            }
        });

    }
}
