package model;

import java.util.Date;
import java.util.List;

public class Pedido {
    private Long id;
    private Date data;
    private String status;
    private List<Produto> produtos;

    public void adicionarProduto(Produto produto) {
        // Implementar lógica para adicionar produto
    }

    public void removerProduto(Produto produto) {
        // Implementar lógica para remover produto
    }

    public void finalizarPedido() {
        // Implementar lógica para finalizar pedido
    }

    public void cancelarPedido() {
        // Implement ar lógica para cancelar pedido
    }

    // Getters e Setters
}