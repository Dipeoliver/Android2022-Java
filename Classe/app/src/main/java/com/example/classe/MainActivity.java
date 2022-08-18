package com.example.classe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.classe.classes.Conta;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Conta conta = new Conta();
        conta.depositar(100);
        conta.sacar(50);
        System.out.println(conta.recuperarSaldo());
        */

        /*
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("diego");
        pessoa.exibirNome("Mario",  30);
        */

        ContaBancaria contabancaria = new ContaBancaria(56464);
























        /*
        // objeto
        Casa minhaCasa = new Casa();
        minhaCasa.cor = "Blue";
        System.out.println(minhaCasa.cor);
        minhaCasa.acenderLuz();
        */

        /*
        Funcionario novoFuncionario = new Funcionario();
        novoFuncionario.nome = "Joana";
        novoFuncionario.salario = 700;
        //double salarioRecuperado = novoFuncionario.recuperaSalario1();
        double salarioRecuperadoExtra = novoFuncionario.recuperaSalario2(200, 140);
        //System.out.println("O salário de " + novoFuncionario.nome + " é R$" + salarioRecuperado);
        System.out.println("O salário com extra de " + novoFuncionario.nome + " é R$" + salarioRecuperadoExtra);
        */

        /*
        // Aula 69
        passaro passaroCriado = new passaro();
        passaroCriado.correr(); // metodo animal
        passaroCriado.dormir(); // metodo animal
        passaroCriado.voar(); // metodo exclusivo do passaro
        passaroCriado.correr();

        System.out.println("-------------------");
        cao caoCriado = new cao();
        caoCriado.correr();
        caoCriado.dormir(); // metodo animal
        caoCriado.latir(); // metodo exclusivo do cao

        caoCriado.setCor("Pink"); // parametro -> para adicionar a cor
        System.out.println(caoCriado.getCor()); // parametro -> para receber a cor


        animal animalCriado = new animal();
        animalCriado.correr();
        */
    }
}
