package com.example.classe;

public class passaro extends  animal{
    void voar(){
        System.out.println("Voando como um passaro");
    }

    void correr(){
        super.correr();  // estamos chamando a implementação padrão da classe pai
        System.out.println("Passaro");
    }
}
