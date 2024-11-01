package service;

import dao.ProdutoDAO;
import model.Produto;
import java.util.List;

public class ProdutoServiceImpl implements ProdutoService {
    private ProdutoDAO produtoDAO;

    public ProdutoServiceImpl(ProdutoDAO produtoDAO) {
        this.produtoDAO = produtoDAO;
    }

    @Override
    public void adicionarProduto(Produto produto) {
        produtoDAO.adicionarProduto(produto);
    }

    @Override
    public void removerProduto(Produto produto) {
        produtoDAO.removerProduto(produto);
    }

    @Override
    public List<Produto> listarProdutos() {
        return produtoDAO.listarProdutos();
    }

    @Override
    public Produto buscarProduto(Long id) {
        return produtoDAO.buscarProduto(id);
    }
}