package controller;

import java.util.List;

public class PedidoController {
    private PedidoService pedidoService;

    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    public void adicionarPedido(Pedido pedido) {
        pedidoService.adicionarPedido(pedido);
    }

    public void removerPedido(Pedido pedido) {
        pedidoService.removerPedido(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidoService.listarPedidos();
    }

    public Pedido buscarPedido(Long id) {
        return pedidoService.buscarPedido(id);
    }
}