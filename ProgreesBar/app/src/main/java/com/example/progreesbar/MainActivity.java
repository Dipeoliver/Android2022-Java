package com.example.progreesbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal, progressBarCircular;
    private int progresso = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarHorizontal = findViewById(R.id.progressBar_Horizontal);
        progressBarCircular = findViewById(R.id.progressBar_Circular);

        // deixar a barra invisivel e tirar da tela
        progressBarCircular.setVisibility(View.GONE);
    }

    public void carregarProgressBar(View view) {
        // Horizontal
        this.progresso = this.progresso + 1;
        progressBarHorizontal.setProgress(this.progresso);
        //circular
        if (this.progresso > 5) {
            progressBarCircular.setVisibility(View.VISIBLE);
        }
    }
}