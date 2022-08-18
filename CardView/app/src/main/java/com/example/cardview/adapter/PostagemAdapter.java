package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagems;

    public PostagemAdapter(List<Postagem> listaPostagens) {
        this.postagems = listaPostagens;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_card, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem postagem = postagems.get(position);
        holder.textView_Name.setText(postagem.getPostagemNome());
        holder.textView_Postagem.setText(postagem.getPostagemText());
        holder.imageView_Postagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        return postagems.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView textView_Name;
        private TextView textView_Postagem;
        private ImageView imageView_Postagem;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView_Name = itemView.findViewById(R.id.textView_Name);
            textView_Postagem = itemView.findViewById(R.id.textView_Postagem);
            imageView_Postagem = itemView.findViewById(R.id.imageView_Postagem);
        }
    }
}
