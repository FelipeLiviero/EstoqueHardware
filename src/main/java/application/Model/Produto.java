package application.EstoqueHardware.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    private byte[] imagem;

    @NotNull(message = "O tipo do produto é obrigatório")
    private Integer tipoProduto;

    @NotBlank(message = "O nome é obrigatório")
    @Size(max = 100, message = "O nome deve ter no máximo 100 caracteres")
    private String nome;

    @Size(max = 50, message = "A marca deve ter no máximo 50 caracteres")
    private String marca;

    @Min(value = 0, message = "A memória não pode ser negativa")
    private Integer memoria;

    @Min(value = 1, message = "A quantidade deve ser pelo menos 1")
    private Integer quantidade;

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getTipo_produto() {
        return tipo_produto;
    }

    public void setTipo_produto(String tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public void getNome(){
        this.nome = nome;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public void getMarca(){
        this.marca = marca;
    }

    public String setMarca(String marca) {
        this.marca = marca;
    }

    public byte getMemoria() {
        return memoria;
    }

    public void setMemoria(byte memoria) {
        this.memoria = memoria;
    }

    public byte getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(byte quantidade) {
        this.quantidade = quantidade;
    }
}