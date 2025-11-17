package model;

import enums.Classificacao;
import model.interfaces.Folha;

public final class Cliente extends Pessoa {


    public Cliente(String nome) {
        super(nome);
    }

    public Cliente(int idade) {
        super(idade);
    }


    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Cliente);
    }

}