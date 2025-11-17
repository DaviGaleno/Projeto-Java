package service;

import model.Vendedor;

import java.util.ArrayList;

public class CadastroVendedor {

    private ArrayList<Vendedor> vendedor = new ArrayList<>();

    public void cadastrar(Vendedor v) {
        vendedor.add(v);
        System.out.println("Nome do cliente cadastrado: " + v.getNome());
        System.out.println("Idade do cliente cadastrado: " + v.getIdade());
        System.out.println("Cpf do cliente cadastrado: " + v.getCpf());
    }

    public void listar() {
        for (Vendedor v : vendedor) {
            System.out.println("Nome: " + v.getNome() + " | Idade: " + v.getIdade() + " | Cpf: " + v.getCpf());

        }
    }

    public void atualizar(String nome, int novaIdade) {

        for (Vendedor v : vendedor) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                v.setIdade(novaIdade);
                System.out.println(" idade atualizada" + novaIdade);
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
    public void deletar(String nome) {
        for (Vendedor v : vendedor) {
            if (v.getNome().equalsIgnoreCase(nome)) {
                vendedor.remove(v);
                System.out.println(" removido com sucesso.");
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
}
