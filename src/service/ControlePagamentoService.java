package service;

import java.util.List;

public interface ControlePagamentoService {
    public void adicionarControlePagamento(ControlePagamento controlePagamento);
    public void removerControlePagamento(ControlePagamento controlePagamento);
    public List<ControlePagamento> listarControlePagamentos();
    public ControlePagamento buscarControlePagamento(Long id);
}