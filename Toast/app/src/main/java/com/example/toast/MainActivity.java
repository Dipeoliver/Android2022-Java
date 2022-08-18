package com.example.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirToast(View view) {
        // Toast Padrão
        /*
        Toast.makeText(
                getApplicationContext(),
                "Toast Aberto com sucesso",
                Toast.LENGTH_LONG
        ).show();
         */

        // Toast Customizado
        ImageView image = new ImageView(getApplicationContext());
        image.setImageResource(android.R.drawable.star_big_off);

        TextView textview = new TextView(getApplicationContext());
        textview.setBackgroundResource(R.color.purple_200);
        textview.setText("Ola Toast");

        Toast toast = new Toast( getApplicationContext());
        toast.setDuration( Toast.LENGTH_LONG);
        //toast.setView(image);
        toast.setView(textview);
        toast.show();
    }
}