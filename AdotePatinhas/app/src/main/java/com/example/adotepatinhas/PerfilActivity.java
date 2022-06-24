package com.example.adotepatinhas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);





        // BOTÕES DE MENU

        TextView abrirMain = (TextView) findViewById(R.id.btnMain);

        abrirMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        TextView abrirAdote = (TextView) findViewById(R.id.btnAdote);

        abrirAdote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilActivity.this, AdoptionActivity.class);
                startActivity(i);
            }
        });

        TextView abrirOngs = (TextView) findViewById(R.id.btnOngs);

        abrirOngs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilActivity.this, OngsActivity.class);
                startActivity(i);
            }
        });
    }
}
