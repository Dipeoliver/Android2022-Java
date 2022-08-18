package com.example.componentesbasicosprojeto;

import static com.example.componentesbasicosprojeto.R.id.TextView;
import static com.example.componentesbasicosprojeto.R.id.textName;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText textname;
    private TextView textemail;
    private TextView textresult;
    private CheckBox checkAzul, checkAmarelo, checkVerde;

    //RadionButton
    private RadioButton radioButtonM, radioButtonF;
    private RadioGroup opcaoSexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textname = findViewById(textName);
        textemail = findViewById(R.id.textEmail);
        textresult = findViewById(R.id.textResult);

        checkAzul = findViewById(R.id.checkBox_azul);
        checkAmarelo = findViewById(R.id.checkBox_amarelo);
        checkVerde = findViewById(R.id.checkBox_verde);

        radioButtonM = findViewById(R.id.radioButtonM);
        radioButtonF = findViewById(R.id.radioButtonF);
        opcaoSexo = findViewById(R.id.radioGroupSexo);
        radioButton();
    }

    public void Enviar(View view) {
        /*
        String name = textname.getText().toString();
        String email = textemail.getText().toString();
        textresult.setText("Nome " + name + "e-mail " + email);
        */

        /*
        checkbox();
        clean();
        */
    }

    public void radioButton() {
        // **************** Adicionar evento para ficar ouvindo o click automático.
        opcaoSexo.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.radioButtonM) {
                    textresult.setText("Você selececionou o sexo: " + radioButtonM.getText().toString());
                } else {
                    textresult.setText("Você selececionou o sexo: " + radioButtonF.getText().toString());
                }
            }
        });
        /*
        if (radioButtonM.isChecked()) {
            textresult.setText("Você selececionou o sexo: " + radioButtonM.getText().toString());
        } else if (radioButtonF.isChecked()) {
            textresult.setText("Você selececionou o sexo: " + radioButtonF.getText().toString());
        }
        */
    }
    /*
    public void checkbox() {
        String corSelecionada = "";

        if (checkAzul.isChecked()) {
             corSelecionada = checkVerde.getText().toString();
        }
        if (checkAmarelo.isChecked()) {
            corSelecionada += checkAmarelo.getText().toString();
        }
        if (checkVerde.isChecked()) {
            corSelecionada += checkVerde.getText().toString();
        }
        textresult.setText("Cores selecionadas " + corSelecionada);
    }
*/

    public void clean() {
        textname.setText("");
        textemail.setText("");
        textname.requestFocus();
    }
}