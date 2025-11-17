import model.Professor;
import service.CadastroProfessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Professor p = new Professor("");
        CadastroProfessor cp = new CadastroProfessor();

        System.out.print("Nome: ");
        p.setNome(sc.next());
        System.out.print("Idade: ");
        p.setIdade(sc.nextInt());
        cp.cadastrar(p);

        cp.listar();

        System.out.print("Informe o novo nome: ");
        p.setNome(sc.next());
        System.out.print("Nova idade: ");
        p.setIdade(sc.nextInt());
        cp.atualizar(p.getNome(), p.getIdade());

        System.out.print("Informe o nome para deletar: ");
        p.setNome(sc.next());
        cp.deletar(p.getNome());

        cp.listar();

        sc.close();
    }
}