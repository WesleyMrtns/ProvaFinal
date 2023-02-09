package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("filmes")
public class Filme {
    @Id
    private String Id;
    private String Nome;
    private String Duração;
    private String valor;
    private String Prazo;
    private String Genero;
    
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public String getDuração() {
        return Duração;
    }
    public void setDuração(String duração) {
        Duração = duração;
    }
    public String getValor() {
        return valor;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
    public String getPrazo() {
        return Prazo;
    }
    public void setPrazo(String prazo) {
        Prazo = prazo;
    }
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
}
