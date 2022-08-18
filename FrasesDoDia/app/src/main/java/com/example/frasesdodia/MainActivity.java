package com.example.frasesdodia;

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

    int i = 0;

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia",
                "frase2",
                "frase3",
                "frase4"
        };
        // exibir randomico
        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);

        /* exibir sequencial

        if (i == 0) {
            texto.setText(frases[i]);
        } else if (i == 1) {
            texto.setText(frases[i]);
        } else if (i == 2) {
            texto.setText(frases[i]);
        } else {
            texto.setText(frases[i]);
            i = -1;
        }
        i++;
         */
    }
}