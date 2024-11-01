package dao;

import java.util.List;

public interface EstoqueDAO {
    public void adicionarEstoque(Estoque estoque);
    public void removerEstoque(Estoque estoque);
    public List<Estoque> listarEstoques();
    public Estoque buscarEstoque(Long id);
}