package service;

import model.Cliente;

import java.util.ArrayList;

public class CadastroCliente {

    private ArrayList<Cliente> cliente = new ArrayList<>();

    public void cadastrar(Cliente c) {
        cliente.add(c);
        System.out.println("Nome do cliente cadastrado: " + c.getNome());
        System.out.println("Idade do cliente cadastrado: " + c.getIdade());
        System.out.println("Cpf do cliente cadastrado: " + c.getCpf());
}

    public void listar() {
        for (Cliente c : cliente) {
            System.out.println("Nome: " + c.getNome() + " | Idade: " + c.getIdade() + " | Cpf: " + c.getCpf());
        }
    }


    public void atualizar(String nome, int novaIdade) {

        for (Cliente c : cliente) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setIdade(novaIdade);
                System.out.println(" idade atualizada" + novaIdade);
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
    public void deletar(String nome) {
        for (Cliente c : cliente) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                cliente.remove(c);
                System.out.println(" removido com sucesso.");
                return;
            }
        }
        System.out.println("Cliente não encontrado.");
    }
}
