import model.Cliente;
import model.Vendedor;
import service.CadastroCliente;
import service.CadastroVendedor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String r;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Digite 1 se for cliente e 2 se for vendedor: ");
            int x = sc.nextInt();

            Vendedor v = new Vendedor("");
            Cliente c = new Cliente("");
            CadastroVendedor cv = new CadastroVendedor();
            CadastroCliente cc = new CadastroCliente();

            switch (x) {

                case 1:
                    System.out.println("Você selecionou cliente");

                    System.out.print("Nome do cliente: ");
                    c.setNome(sc.next());
                    System.out.print("Idade do cliente: ");
                    c.setIdade(sc.nextInt());
                    cc.cadastrar(c);
                    System.out.print("Idade do cpf: ");
                    c.setCpf(sc.nextInt());
                    cc.cadastrar(c);

                    System.out.print("Deseja atualizar os dados? (S/N): ");
                    String atualizarCliente = sc.next();
                    if (atualizarCliente.equalsIgnoreCase("S")) {
                        System.out.print("Informe o novo nome: ");
                        c.setNome(sc.next());
                        System.out.print("Nova idade: ");
                        c.setIdade(sc.nextInt());
                        cc.atualizar(c.getNome(), c.getIdade());
                    }

                    System.out.print("Deseja excluir os dados? (S/N): ");
                    String excluirCliente = sc.next();
                    if (excluirCliente.equalsIgnoreCase("S")) {
                        System.out.print("Informe o nome para deletar: ");
                        c.setNome(sc.next());
                        cc.deletar(c.getNome());
                    }

                    cc.listar();
                    break;

                case 2:
                    System.out.println("Você selecionou vendedor");

                    System.out.print("Nome do vendedor: ");
                    v.setNome(sc.next());
                    System.out.print("Idade do vendedor: ");
                    v.setIdade(sc.nextInt());
                    System.out.print("Idade do cpf: ");
                    v.setCpf(sc.nextInt());
                    cv.cadastrar(v);


                    System.out.print("Deseja atualizar os dados? (S/N): ");
                    String atualizarVendedor = sc.next();
                    if (atualizarVendedor.equalsIgnoreCase("S")) {
                        System.out.print("Informe o novo nome: ");
                        v.setNome(sc.next());
                        System.out.print("Nova idade: ");
                        v.setIdade(sc.nextInt());
                        cv.atualizar(v.getNome(), v.getIdade());
                    }

                    System.out.print("Deseja excluir os dados? (S/N): ");
                    String excluirVendedor = sc.next();
                    if (excluirVendedor.equalsIgnoreCase("S")) {
                        System.out.print("Informe o nome para deletar: ");
                        v.setNome(sc.next());
                        cv.deletar(v.getNome());
                    }

                    cv.listar();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.println("Quer se cadastrar novamente? Digite S para sim ou qualquer outra tecla para sair.");
            r = sc.next();

        } while (r.equalsIgnoreCase("S"));

        sc.close();
    }
}
