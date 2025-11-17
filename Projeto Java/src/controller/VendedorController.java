package controller;

import model.Vendedor;

import java.util.List;

public class VendedorController {
    private VendedorController VendedorService = new VendedorController();

        public void cadastrarVendedor(Vendedor vendedor) {
            VendedorService.cadastrarVendedor(vendedor);
        }
        public List<Vendedor> listarVendedor() {
            return VendedorService.listarVendedor();
        }
        public void atualizarVendedor(String nome, String novoNome) {
            VendedorService.atualizarVendedor(nome, novoNome);
        }
        public void deletarVendedor(String nome) {
            VendedorService.deletarVendedor(nome);
        }
    }