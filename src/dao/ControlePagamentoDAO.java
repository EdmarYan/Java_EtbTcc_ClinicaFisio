package dao;

import java.util.List;

public interface ControlePagamentoDAO {
    public void adicionarControlePagamento(ControlePagamento controlePagamento);
    public void removerControlePagamento(ControlePagamento controlePagamento);
    public List<ControlePagamento> listarControlePagamentos();
    public ControlePagamento buscarControlePagamento(Long id);
}