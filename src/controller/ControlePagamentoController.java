package controller;

import java.util.List;

public class ControlePagamentoController {
    private ControlePagamentoService controlePagamentoService;

    public ControlePagamentoController(ControlePagamentoService controlePagamentoService) {
        this.controlePagamentoService = controlePagamentoService;
    }

    public void adicionarControlePagamento(ControlePagamento controlePagamento) {
        controlePagamentoService.adicionarControlePagamento(controlePagamento);
    }

    public void removerControlePagamento(ControlePagamento controlePagamento) {
        controlePagamentoService.removerControlePagamento(controlePagamento);
    }

    public List<ControlePagamento> listarControlePagamentos() {
        return controlePagamentoService.listarControlePagamentos();
    }

    public ControlePagamento buscarControlePagamento(Long id) {
        return controlePagamentoService.buscarControlePagamento(id);
    }
}