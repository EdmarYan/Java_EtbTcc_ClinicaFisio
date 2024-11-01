package service;

import java.util.List;

public interface PedidoService {
    public void adicionarPedido(Pedido pedido);
    public void removerPedido(Pedido pedido);
    public List<Pedido> listarPedidos();
    public Pedido buscarPedido(Long id);
}