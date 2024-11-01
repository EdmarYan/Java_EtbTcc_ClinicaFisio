package controller;

import java.util.List;

public class ProdutoController {
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    public void adicionarProduto(Produto produto) {
        produtoService.adicionarProduto(produto);
    }

    public void removerProduto(Produto produto) {
        produtoService.removerProduto(produto);
    }

    public List<Produto> listarProdutos() {
        return produtoService.listarProdutos();
    }

    public Produto buscarProduto(Long id) {
        return produtoService.buscarProduto(id);
    }
}