package controller;

import java.util.List;

public class EstoqueController {
    private EstoqueService estoqueService;

    public EstoqueController(EstoqueService estoqueService) {
        this.estoqueService = estoqueService;
    }

    public void adicionarEstoque(Estoque estoque) {
        estoqueService.adicionarEstoque(estoque);
    }

    public void removerEstoque(Estoque estoque) {
        estoqueService.removerEstoque(estoque);
    }

    public List<Estoque> listarEstoques() {
        return estoqueService.listarEstoques();
    }

    public Estoque buscarEstoque(Long id) {
        return estoqueService.buscarEstoque(id);
    }
}