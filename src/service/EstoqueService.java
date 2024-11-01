package service;

import java.util.List;

public interface EstoqueService {
    public void adicionarEstoque(Estoque estoque);
    public void removerEstoque(Estoque estoque);
    public List<Estoque> listarEstoques();
    public Estoque buscarEstoque(Long id);
}