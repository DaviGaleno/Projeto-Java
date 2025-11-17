package service;

import model.Professor;

import java.util.ArrayList;

public class CadastroProfessor {

    private ArrayList<Professor> professores = new ArrayList<>();

    public void cadastrar(Professor p) {
        professores.add(p);
        System.out.println("Professor cadastrado: " + p.getNome());
    }

    public void listar() {
        for (Professor p : professores) {
            System.out.println("Nome: " + p.getNome() + p.getIdade());

        }
    }

    public void atualizar(String nome, int novaIdade) {

        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                p.setIdade(novaIdade);
                System.out.println(" idade atualizada" + novaIdade);
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
    public void deletar(String nome) {
        for (Professor p : professores) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                professores.remove(p);
                System.out.println(" removido com sucesso.");
                return;
            }
        }
        System.out.println("Professor não encontrado.");
    }
}
