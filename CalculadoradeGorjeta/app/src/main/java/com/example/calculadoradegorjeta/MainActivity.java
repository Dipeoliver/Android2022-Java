package com.example.calculadoradegorjeta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    private TextInputEditText txtValorEntrada;
    private SeekBar seekBar;
    private TextView txtGorjeta, txtTotal, txtseekbar;
    private double Valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtValorEntrada = findViewById(R.id.txt_ValorEntrada);
        seekBar = findViewById(R.id.seekBar);
        txtGorjeta = findViewById(R.id.etxt_Gorjeta);
        txtTotal = findViewById(R.id.etxt_ValorTotal);
        txtseekbar = findViewById(R.id.txtSeekbar);
        caluloListener();

    }

    public void caluloListener() {
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                String StringEntrada = txtValorEntrada.getText().toString();

                if (StringEntrada == null || StringEntrada.equals("")) {
                    Toast.makeText(getApplicationContext(),
                            "Digitar um valor ",
                            Toast.LENGTH_SHORT
                    ).show();
                } else {
                    if (StringEntrada.equals("")) {
                        txtValorEntrada.setText("0");
                    }
                    double valorEntrada = Double.parseDouble(StringEntrada);
                    double ValorGorjeta = (valorEntrada * i) / 100;
                    double ValorFinal = (valorEntrada + ValorGorjeta);

                    txtseekbar.setText(i + "%");
                    txtGorjeta.setText("R$ " + ValorGorjeta);
                    txtTotal.setText("R$ " + ValorFinal);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}