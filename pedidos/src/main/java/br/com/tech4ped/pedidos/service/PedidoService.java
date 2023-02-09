package br.com.tech4ped.pedidos.service;
import java.util.List;
import java.util.Optional;
import br.com.tech4ped.pedidos.shared.PedidoCompletoDto;
import br.com.tech4ped.pedidos.shared.PedidoDto;

public interface PedidoService {

    List<PedidoCompletoDto> obterPedidos();
    Optional<PedidoDto> obterPedidoPorId(String id);
    void excluirPedido(String id);
    PedidoCompletoDto CadastrarPedido(PedidoCompletoDto pedido);
    Optional<PedidoDto> atualizarPedidoPorId(String id, PedidoDto dto);
    
}