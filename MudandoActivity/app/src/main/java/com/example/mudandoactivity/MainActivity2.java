package com.example.mudandoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView textViewName;
    private TextView textViewIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textViewIdade = findViewById(R.id.textView_Age);
        textViewName = findViewById(R.id.textView_Name);

        // 4- Recuperar Dados enviados
        Bundle dados = getIntent().getExtras(); // recuperei todos dados

        //5- Adicionar dados enviados para variaveis
        String nome = dados.getString("name");
        int idade = dados.getInt("age");
        //-------------------------------------------------------

        // 9- Recuperar dados de objeto.
        Usuario usuario = (Usuario) dados.getSerializable("Objeto");
        textViewName.setText(usuario.getEmail());
        textViewIdade.setText(usuario.getNome());


        /*
        //6-  Passar dados para a tela
        textViewName.setText(nome);
        textViewIdade.setText(String.valueOf(idade));
        */
    }
}