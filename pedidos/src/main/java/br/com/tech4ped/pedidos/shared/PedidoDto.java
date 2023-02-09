package br.com.tech4ped.pedidos.shared;
import br.com.tech4ped.pedidos.model.Filme;

public class PedidoDto {
    private String nomeCliente;
    private String idFilme;
    private String valor;
    private Filme dadosFilme;


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
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public Filme getDadosFilme() {
        return dadosFilme;
    }
    public void setDadosFilme(Filme dadosFilme) {
        this.dadosFilme = dadosFilme;
    }
    
}