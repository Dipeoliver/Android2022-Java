package com.example.recyclerview2.model;

public class Filme {

    //17
    private String tituloFilme;
    private String genero;
    private String ano;


    //18
    public Filme(String tituloFilme, String genero, String ano) {
        this.tituloFilme = tituloFilme;
        this.genero = genero;
        this.ano = ano;
    }

    //19
    public String getTituloFilme() {
        return tituloFilme;
    }

    public void setTituloFilme(String tituloFilme) {
        this.tituloFilme = tituloFilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
}
