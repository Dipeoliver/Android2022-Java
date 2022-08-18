package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sotearNumero(View view){
        TextView texto = findViewById(R.id.txtResult);
        int gerador = new Random().nextInt(11) + 1; // variação vai de 1 a 10
        texto.setText("O Número é " + gerador);
    }
}