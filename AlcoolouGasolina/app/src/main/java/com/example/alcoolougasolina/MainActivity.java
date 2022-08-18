package com.example.alcoolougasolina;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtAlcool;
    private TextView txtGasolina;
    private TextView txtResultado;
    private Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAlcool = findViewById(R.id.txtPreco_Alcool);
        txtGasolina = findViewById(R.id.txtPreco_Gasolina);
        txtResultado = findViewById(R.id.txtView_Resultado);
        btnCalcular = findViewById(R.id.button_Calcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void Calcular(View view) {

        String precoAlcool = txtAlcool.getText().toString();
        String precoGasolina = txtGasolina.getText().toString();

        System.out.println("***********************" + precoAlcool);
        System.out.println("***********************" + precoGasolina);


        boolean resultado = ValidaCampos(precoAlcool, precoGasolina);

        if (resultado) {
            double valorAlcool = Double.parseDouble(precoAlcool);
            double valorGasolina = Double.parseDouble(precoGasolina);
            double resultadoFinal = valorAlcool / valorGasolina;

            if (resultadoFinal <= 0.7) {
                txtResultado.setText("Melhor utilizar: Álcool");
            } else {
                txtResultado.setText("Melhor utilizar: Gasolina");
            }
        } else {
            txtResultado.setText("preencha os preços primeiro");
        }
    }

    public boolean ValidaCampos(String pAlcool, String pGasolina) {
        boolean resultado = true;

        if (pAlcool == null || pAlcool.equals("")) {
            resultado = false;
        } else if (pGasolina == null || pGasolina.equals("")) {
            resultado = false;
        }
        return resultado;
    }

    // duvida porque
}