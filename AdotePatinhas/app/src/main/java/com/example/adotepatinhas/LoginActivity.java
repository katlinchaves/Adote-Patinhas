package com.example.adotepatinhas;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends AppCompatActivity {


    AlertDialog.Builder builder;


    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button entrar = (Button) findViewById(R.id.btnEntrar);

        builder = new AlertDialog.Builder(LoginActivity.this);

        entrar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {


                EditText usuario = (EditText) findViewById(R.id.txtUsuario);
                String usuarioE = usuario.getText().toString();
                EditText senha = (EditText) findViewById(R.id.txtSenha);
                String senhaE = senha.getText().toString();

                if (usuarioE.equals("katlinchaves") && senhaE.equals("12345")) {


                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(i);


                } else {

                    Toast.makeText(getApplicationContext(), "Digite corretamente os dados",
                            Toast.LENGTH_SHORT).show();


                }

            }

















        });



    }
}
