package controller;

import model.Cliente;
import model.Vendedor;

import java.util.List;

public class ClienteController {
    private ClienteController ClienteService = new ClienteController();

    public void cadastrarCliente(Cliente cliente) {
        ClienteService.cadastrarCliente(cliente);
    }
    public List<Cliente> listarCliente() {
        return ClienteService.listarCliente();
    }
    public void atualizarCliente(String nome, String novoNome) {
        ClienteService.atualizarCliente(nome, novoNome);
    }
    public void deletarCliente(String nome) {
        ClienteService.deletarCliente(nome);
    }
}