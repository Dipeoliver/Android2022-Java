package com.example.classe;

public class Funcionario {

    //propriedades
    String nome;
    double salario;

    // metodos sem retorno
    void recuperaSalario() {
        this.salario = this.salario - (this.salario * 0.10);
        System.out.println(this.salario);
    }

    // metodos com retorno
    double recuperaSalario1() {
        this.salario = this.salario - (this.salario * 0.10);
        return this.salario;
    }

    double recuperaSalario2(double extra, double extra2) {
        this.salario = this.salario - (this.salario * 0.10);
        this.salario = this.salario + extra + extra2;
        return this.salario;
    }
}
