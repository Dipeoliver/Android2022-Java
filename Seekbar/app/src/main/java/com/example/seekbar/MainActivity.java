package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView txtProgresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBar);
        txtProgresso = findViewById(R.id.txt_Progresso);
        listener();
    }

    public void listener() {
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txtProgresso.setText("Progresso: " + i + " / " + seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //txtProgresso.setText("Clicked");

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //txtProgresso.setText("out clicked");

            }
        });
    }

    public void recuperar(View view) {
        txtProgresso.setText("Progresso: "  + seekBar.getProgress());
    }
}