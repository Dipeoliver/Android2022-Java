package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageButton imageButtonVoltar;
    private ImageView imageViewMoeda;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageButtonVoltar = findViewById(R.id.imageButton_Voltar);
        imageViewMoeda = findViewById(R.id.imageView_Moeda);

        Bundle dados = getIntent().getExtras();
        int randon = dados.getInt("randon");
        if (randon == 1) {
            imageViewMoeda.setImageResource(R.drawable.moeda_cara);
        } else {
            imageViewMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        imageButtonVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}