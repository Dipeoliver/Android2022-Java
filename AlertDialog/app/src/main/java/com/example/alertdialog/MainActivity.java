package com.example.alertdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view) {
        // ********   instanciar Objeto
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        // ********   configurar o titulo e mensagem
        dialog.setTitle("Título da Dialog");
        dialog.setMessage("Message da Dialog");

        // (proibrir clicar fora da caixa == false / habilitar == true)
        dialog.setCancelable(false);

        // configurar icone
        dialog.setIcon(android.R.drawable.btn_plus);

        //********   configurar acoes para sim e não
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação ao clicar no botão SIM",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getApplicationContext(),
                        "Executar ação ao clicar no botão NÃO",
                        Toast.LENGTH_LONG
                ).show();
            }
        });

        // ********   criar e exibir AlertDialog
        dialog.create();
        dialog.show();
    }
}