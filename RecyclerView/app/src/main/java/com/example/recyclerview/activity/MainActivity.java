package com.example.recyclerview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.recyclerview.R;
import com.example.recyclerview.adapter.Adapter;
import com.example.recyclerview.model.Filme;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //10
    private List<Filme> listaFilmes = new ArrayList<>();
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        //11-b
        // criar listagem de filmes
        this.criarFilmes();


        // ******** configurar o adapter
        //5
        Adapter adapter = new Adapter(listaFilmes);


        // ******** configurar o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL)); //24
        //6
        recyclerView.setAdapter(adapter);
    }

    //11
    public void criarFilmes(){
        Filme filme = new Filme("1","1","2001" );
        this.listaFilmes.add(filme);

         filme = new Filme("2","2","2002" );
        this.listaFilmes.add(filme);

         filme = new Filme("3","4","2003" );
        this.listaFilmes.add(filme);

         filme = new Filme("4","4","2004" );
        this.listaFilmes.add(filme);

         filme = new Filme("5","5","2005" );
        this.listaFilmes.add(filme);

         filme = new Filme("6","6","2006" );
        this.listaFilmes.add(filme);

         filme = new Filme("7","7","2007" );
        this.listaFilmes.add(filme);

         filme = new Filme("8","8","2008" );
        this.listaFilmes.add(filme);

        filme = new Filme("9","9","2009" );
        this.listaFilmes.add(filme);

        filme = new Filme("10","10","2010" );
        this.listaFilmes.add(filme);

        filme = new Filme("11","11","2011" );
        this.listaFilmes.add(filme);

        filme = new Filme("12","12","2012" );
        this.listaFilmes.add(filme);

    }
}