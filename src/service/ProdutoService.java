package service;

import java.util.List;

public interface ProdutoService {
    public void adicionarProduto(Produto produto);
    public void removerProduto(Produto produto);
    public List<Produto> listarProdutos();
    public Produto buscarProduto(Long id);
}