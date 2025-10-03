package application.model;

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

    // Getters e Setters

    public Long getId() {
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }

    public byte[] getImagem() {
        return imagem;
    }
    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public Integer getTipoProduto() {
        return tipoProduto;
    }
    public void setTipoProduto(Integer tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getMemoria() {
        return memoria;
    }
    public void setMemoria(Integer memoria) {
        this.memoria = memoria;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
