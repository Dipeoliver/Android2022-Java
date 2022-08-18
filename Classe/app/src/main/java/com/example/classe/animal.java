package com.example.classe;

public class animal {
    int tamanho;
    double peso;
    String cor;

    // Parametros
    // *****************  setter *****************
    void setCor(String cor){
        // formatação e validação
        this.cor = cor;  // recebe a cor como parametro e configura
    }
    void setTamanho (int tamanho){
        this.tamanho = tamanho;
    }
    void  setPeso (double peso){
        this.peso = peso;
    }
    //  *****************  Getter *****************
    String getCor(){
        return  this.cor;
    }
    int getTamanho(){
        return  this.tamanho;
    }
    double getPeso (){
        return this.peso;
    }






    // ******************************************************************
    // metodos
    void dormir(){
        System.out.println("Dormir como um animal");
    };
    void correr(){
        System.out.print("correr como um ");
    };
}
