package br.com.tech4ped.pedidos.httpClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.tech4ped.pedidos.model.Filme;

@FeignClient("Locadora")
public interface LocadoraClient {
    
    @RequestMapping(method= RequestMethod.GET, value="/locadora/{id}")
    Filme obterFilme(@PathVariable String id);

}