package Shared;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class FilmeCompletoDto {

    private String Id;

    @NotEmpty(message="Campo nome deve ser informado")
    private String Nome;
    @NotEmpty(message="Campo duração deve ser informado")
    @Size(min=5, max=6, message="Informe 120min, 69min, 100min")
    private String Duração;
    @NotEmpty(message="Campo valor deve ser informado")
    private String valor;
    @NotEmpty(message="Campo prazo deve ser informado")
    private String Prazo;
    @NotEmpty(message="Campo genero deve ser informado")
    private String Genero;



    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
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
    
}
