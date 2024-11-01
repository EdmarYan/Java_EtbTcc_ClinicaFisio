package model;

import java.util.List;

public class Funcionario extends Usuario {
    private String cargo;
    private List<String> permissoes;

    public void gerenciarAgenda() {
        // Implementar lógica para gerenciar agenda
    }

    public void emitirRecibo() {
        // Implementar lógica para emitir recibo
    }

    public void controlarPresenca() {
        // Implementar lógica para controlar presença
    }

    public void adicionarProduto(Produto produto) {
        // Implementar lógica para adicionar produto
    }

    public void removerProduto(Produto produto) {
        // Implementar lógica para remover produto
    }

    public void atualizarProduto(Produto produto) {
        // Implementar lógica para atualizar produto
    }

    public List<Produto> visualizarEstoque() {
        // Implementar lógica para visualizar estoque
        return null;
    }

    // Getters e Setters
}