package br.com.tech4ped.pedidos.service;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.tech4ped.pedidos.httpClient.LocadoraClient;
import br.com.tech4ped.pedidos.model.Pedido;
import br.com.tech4ped.pedidos.repository.PedidoRepository;
import br.com.tech4ped.pedidos.shared.PedidoCompletoDto;
import br.com.tech4ped.pedidos.shared.PedidoDto;

@Service
public class PedidoServiceImpl implements PedidoService{


    @Autowired
    private PedidoRepository repository;

    @Autowired
    private LocadoraClient locadoraClient;

    @Override
    public List<PedidoCompletoDto> obterPedidos() {
        List<Pedido> pedidos = repository.findAll();
        List<PedidoCompletoDto> dto = pedidos.stream().map(f -> new ModelMapper().map(f, PedidoCompletoDto.class)).collect(Collectors.toList());
        return dto;
    }

    @Override
    public Optional<PedidoDto> obterPedidoPorId(String id) {
        
        Optional<Pedido> pedido = repository.findById(id);
        if(pedido.isPresent()){
            PedidoDto pedidoComFilme = new ModelMapper().map(pedido, PedidoDto.class);
            pedidoComFilme.setDadosFilme(locadoraClient.obterFilme(pedidoComFilme.getIdFilme()));
            return Optional.of(pedidoComFilme);
        }else{
            return Optional.empty();
        }
    }

    @Override
    public void excluirPedido(String id) {
        repository.deleteById(id);
    }

    @Override
    public PedidoCompletoDto CadastrarPedido(PedidoCompletoDto dto) {
        Pedido pedido = new ModelMapper().map(dto, Pedido.class);

        repository.save(pedido);
        return new ModelMapper().map(pedido,PedidoCompletoDto.class);
    }

    @Override
    public Optional<PedidoDto> atualizarPedidoPorId(String id, PedidoDto dto) {
        Optional<Pedido> retorno = repository.findById(id);

        if(retorno.isPresent()){
            Pedido pedidoRetorno = new ModelMapper().map(dto, Pedido.class);
            pedidoRetorno.setId(id);
            repository.save(pedidoRetorno);
            return Optional.of(new ModelMapper().map(pedidoRetorno, PedidoDto.class));
        }else{
            return Optional.empty();
        }
    }   
}