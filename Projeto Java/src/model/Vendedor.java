package model;

import enums.Classificacao;
import model.interfaces.Folha;

public final class Vendedor extends Pessoa{


    public Vendedor(String nome) {
        super(nome);
    }

    public Vendedor(int idade) {
        super(idade);
    }


    @Override
    public void quem_sou_eu() {
        System.out.println(Classificacao.Vendedor);
    }

}