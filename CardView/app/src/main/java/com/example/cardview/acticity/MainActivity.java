package com.example.cardview.acticity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>(); //20



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        this.prepararPostagens();
        //exibir na horizontal
       //LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
       //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        // Exibir em forma de Grid
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this,2);

        recyclerPostagem.setLayoutManager(layoutManager);
        recyclerPostagem.setHasFixedSize(true);
        PostagemAdapter adapter = new PostagemAdapter(postagens); //23
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Diego Oliveira","TBT Viagem Legal",R.drawable.imagem1 );
        this.postagens.add(p);

        p = new Postagem("Claudia Tatiana","TBT Viagem Boa",R.drawable.imagem2 );
        this.postagens.add(p);

        p = new Postagem("Luiz Carlos","TBT Viagem Maravilhosa",R.drawable.imagem3 );
        this.postagens.add(p);

        p = new Postagem("Lucia Pereira","TBT Viagem DElicia",R.drawable.imagem4 );
        this.postagens.add(p);
    }
}