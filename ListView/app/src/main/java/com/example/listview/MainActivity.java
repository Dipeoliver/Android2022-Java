package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listLocais;
    private String[] itens = {
            "São Paulo","Rio de Janeiro","Salvador",
            "Belo Horizonte"," Fortaleza","Curitiba", "Manaus",
            "Tremembé","Taubaté","São Paulo1","Rio de Janeiro1","Salvador1",
            "Belo Horizonte1"," Fortaleza1","Curitiba1", "Manaus1",

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listLocais = findViewById(R.id.list_Locais);
        // ************* criar adaptador para a lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),              // contexto
                android.R.layout.simple_list_item_1, // tipo de layout
                android.R.id.text1,                  // identificador do layout
                itens                                // minha lista.
        );

        // ************* Adicionar adpatador para a lista
        listLocais.setAdapter(adaptador);

        // ************* Adicionar click na lista
        listLocais.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String Valorclick = listLocais.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, Valorclick, Toast.LENGTH_SHORT).show();
            }
        });
    }
}