package com.example.adotepatinhas;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PerfilPetActivity extends AppCompatActivity {

    Button closeButton;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil_pet);


        closeButton = (Button) findViewById(R.id.btnGetPet);
        builder = new AlertDialog.Builder(this);
        closeButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

                builder.setMessage("Lembre-se que um pet exige muito amor e responsabilidade")
                        .setCancelable(false)
                        .setPositiveButton("Não", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                finish();
                                Toast.makeText(getApplicationContext(),"sua solicitação de adoção foi cancelada",
                                        Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("Sim", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                Toast.makeText(getApplicationContext(),"sua solicitação de adoção foi enviada",
                                        Toast.LENGTH_SHORT).show();
                            }
                        });
                //Creating dialog box
                AlertDialog alert = builder.create();
                //Setting the title manually
                alert.setTitle("Você realmente deseja adotar esse pet ?");
                alert.show();
            }
        });

        // BOTÕES DE MENU

        TextView abrirMain = (TextView) findViewById(R.id.btnMain);

        abrirMain.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilPetActivity.this, MainActivity.class);
                startActivity(i);
            }
        });

        TextView abrirAdote = (TextView) findViewById(R.id.btnAdote);

        abrirAdote.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilPetActivity.this, AdoptionActivity.class);
                startActivity(i);
            }
        });

        TextView abrirOngs = (TextView) findViewById(R.id.btnOngs);

        abrirOngs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilPetActivity.this, OngsActivity.class);
                startActivity(i);
            }
        });

        TextView abrirPerfil = (TextView) findViewById(R.id.btnPerfil);

        abrirPerfil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(PerfilPetActivity.this, PerfilActivity.class);
                startActivity(i);
            }
        });
    }
}
