package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ImageButton imageButtonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageButtonJogar = findViewById(R.id.imageButton_Jogar);


        imageButtonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numero = new Random().nextInt(2);

                Intent intent = new Intent(getApplicationContext(), ResultadoActivity.class);
                intent.putExtra("randon", numero);
                startActivity(intent);
            }
        });
    }
}