package com.example.recyclerview2.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview2.R;
import com.example.recyclerview2.adapter.Adapter;
import com.example.recyclerview2.model.Filme;
import com.example.recyclerview2.RecyclerItemClickListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView; //3-a
    private List<Filme> listaFilmes = new ArrayList<>(); //20

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView); //3-b

        //22
        this.criarFilmes();

        //14
        Adapter adapter = new Adapter(listaFilmes); //23

        //4
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL)); //27

        //15
        recyclerView.setAdapter(adapter);


        //29
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                //30
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(),
                                        "Item Pressionado: " + filme.getTituloFilme() ,
                                        Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme = listaFilmes.get(position);
                                Toast.makeText(getApplicationContext(),
                                        "Click Longo " + filme.getTituloFilme(),
                                        Toast.LENGTH_SHORT).show();
                            }

                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                            }
                        }
                )
        );
    }

    //21
    public void criarFilmes() {
        Filme filme = new Filme("1", "1", "2001");
        this.listaFilmes.add(filme);

        filme = new Filme("2", "2", "2002");
        this.listaFilmes.add(filme);

        filme = new Filme("3", "4", "2003");
        this.listaFilmes.add(filme);

        filme = new Filme("4", "4", "2004");
        this.listaFilmes.add(filme);

        filme = new Filme("5", "5", "2005");
        this.listaFilmes.add(filme);

        filme = new Filme("6", "6", "2006");
        this.listaFilmes.add(filme);

        filme = new Filme("7", "7", "2007");
        this.listaFilmes.add(filme);

        filme = new Filme("8", "8", "2008");
        this.listaFilmes.add(filme);

        filme = new Filme("9", "9", "2009");
        this.listaFilmes.add(filme);

        filme = new Filme("10", "10", "2010");
        this.listaFilmes.add(filme);

        filme = new Filme("11", "11", "2011");
        this.listaFilmes.add(filme);

        filme = new Filme("12", "12", "2012");
        this.listaFilmes.add(filme);

    }
}