package com.example.cardview.model;

public class Postagem {

    private String postagemNome;
    private String postagemText;
    private int imagem;

    public Postagem(String postagemNome, String postagemText, int imagem) {
        this.postagemNome = postagemNome;
        this.postagemText = postagemText;
        this.imagem = imagem;
    }

    public String getPostagemNome() {
        return postagemNome;
    }

    public void setPostagemNome(String postagemNome) {
        this.postagemNome = postagemNome;
    }

    public String getPostagemText() {
        return postagemText;
    }

    public void setPostagemText(String postagemText) {
        this.postagemText = postagemText;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
