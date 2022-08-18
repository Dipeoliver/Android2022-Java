package com.example.toggleeswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleButton;
    private Switch aSwitch;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleButton = findViewById(R.id.toggle_Senha);
        aSwitch = findViewById(R.id.switch_Senha);
        textView = findViewById(R.id.txt_Resultado);

        adicionarListener();
    }

    // evento para ficar escutando o botão
    public void adicionarListener(){
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    textView.setText("Switch " + aSwitch.getTextOn());
                }else{
                    textView.setText("Switch " + aSwitch.getTextOff());
                }
            }
        });
    }
    public void enviar(View view) {
        /*
        if (aSwitch.isChecked()) {
            textView.setText("Switch " + aSwitch.getTextOn());
        } else {
            textView.setText("Switch " + aSwitch.getTextOff());
        }
        */
        if (toggleButton.isChecked()) {
            textView.setText("ToggleButton " + aSwitch.getTextOn());
        } else {
            textView.setText("ToggleButton " + aSwitch.getTextOff());
        }
    }
}