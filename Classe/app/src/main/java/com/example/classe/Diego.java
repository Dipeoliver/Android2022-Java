package com.example.classe;

public class Diego extends Cidadao implements Presidente {

    @Override
    public void ganharEleicao() {
        System.out.println("Win the eleicao in EUA");
    }
}
