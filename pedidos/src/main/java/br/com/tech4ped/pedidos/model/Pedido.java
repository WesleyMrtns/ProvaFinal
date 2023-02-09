package br.com.tech4ped.pedidos.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document ("pedidos")
public class Pedido {
    @Id
    private String id;
    private String nomeCliente;
    private String idFilme;
    private String valorTotal;

    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public String getIdFilme() {
        return idFilme;
    }
    public void setIdFilme(String idFilme) {
        this.idFilme = idFilme;
    }
    public String getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(String valorTotal) {
        this.valorTotal = valorTotal;
    }
}