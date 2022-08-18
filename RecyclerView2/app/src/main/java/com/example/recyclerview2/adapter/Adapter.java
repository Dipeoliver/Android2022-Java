package com.example.recyclerview2.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview2.R;
import com.example.recyclerview2.model.Filme;

import java.util.List;

//10                   //6
public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    //24
    private List<Filme> listaFilmes;
    public Adapter(List<Filme> lista) {this.listaFilmes = lista;}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //12
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //26
        Filme filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.ano.setText(filme.getAno());
        holder.genero.setText(filme.getGenero());
    }
    @Override
    public int getItemCount() {
        //25
        return listaFilmes.size();
    }
    //7
    public class MyViewHolder extends RecyclerView.ViewHolder {

        //9
        TextView titulo;
        TextView ano;
        TextView genero;

        //8
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //13
            titulo = itemView.findViewById(R.id.text_Titulo);
            ano = itemView.findViewById(R.id.text_Ano);
            genero = itemView.findViewById(R.id.text_Genero);
        }
    }
}
