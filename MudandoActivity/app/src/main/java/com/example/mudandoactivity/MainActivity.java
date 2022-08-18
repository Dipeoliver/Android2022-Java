package com.example.mudandoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.button_Enviar);
        // 1- Enviar dados com o click do botão
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //2- Abrir outra activity
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);

                // 3- Passar dados
                intent.putExtra("name","Diego Oliveira");
                intent.putExtra("age",40);

                // 7 - Instanciar Objeto
                Usuario usuario = new Usuario("Diego Pereira", "diegopo@motorola.com");

                // 8 - dentro da classe adicionar implements Serializable
                intent.putExtra("Objeto",usuario);

                startActivity(intent);
            }
        });
    }
}