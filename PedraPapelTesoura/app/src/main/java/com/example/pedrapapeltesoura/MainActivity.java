package com.example.pedrapapeltesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View view) {
        this.opcaoSelecionada("Pedra");

    }

    public void selecionadoPapel(View view) {
        this.opcaoSelecionada("Papel");
    }

    public void selecionadoTesoura(View view) {
        this.opcaoSelecionada("Tesoura");
    }

    public void opcaoSelecionada(String escolhaUsuario) {
        //System.out.println(opcaoSelecionada);

        ImageView imageResultado = findViewById(R.id.imageResultado);
        TextView textResultado = findViewById(R.id.textResultado);


        int numero = new Random().nextInt(3);
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        String opacaoApp = opcoes[numero];

        // mudar imagem dinâmica
        switch (opacaoApp) {
            case "Pedra":
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "Papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;
            default:
                imageResultado.setImageResource(R.drawable.tesoura);
        }

        if ((opacaoApp == "Pedra" && escolhaUsuario == "Tesoura") ||
                (opacaoApp == "Papel" && escolhaUsuario == "Pedra") ||
                (opacaoApp == "Tesoura" && escolhaUsuario == "Papel")) {
            textResultado.setText("Você Perdeu");
        } else if ((opacaoApp == "Tesoura" && escolhaUsuario == "Pedra") ||
                (opacaoApp == "Pedra" && escolhaUsuario == "Papel") ||
                (opacaoApp == "Papel" && escolhaUsuario == "Tesoura")) {
            textResultado.setText("Você Ganhou");
        } else {
            textResultado.setText("Vocês Empataram");
        }
    }
}