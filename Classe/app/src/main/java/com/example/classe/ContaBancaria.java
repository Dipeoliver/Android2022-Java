package com.example.classe;

public class ContaBancaria {

    // parametros
    private int numeroConta;
    private double saldo;

    // construtor -> utilizado configurar objetos
    public ContaBancaria() {
        System.out.println("Configurações iniciais");
    }
    // construtor -> com parametros
    public ContaBancaria(int nconta) {
        this.numeroConta = nconta;
        System.out.println("Construtor chamado "+ numeroConta);
    }


    //metodos
    public void meuMetodo() {

    }
}
