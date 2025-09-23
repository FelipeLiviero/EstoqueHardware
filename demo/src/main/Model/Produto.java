import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

@Entity

@table(name = "Produtos")
public class produto {
    @Id // Gera Id unico e obrigatorio no BD
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo Tipo de produto e obrigatoeio")
    private int tipo_produto;

    @NotBlank(message = "O campo Marca e obrigatorio")
    @Size(max = 100, mesage = "O nome deve ter no maximo 100 caracteres")
    private String marca;

    @Positive(message = "A quantidade de memoria tem que ser um numero positivo")
    private int memoria;

    private int quantidade; // Ira ser atribuida apos a criacao do produto

    public Produto(int codigo, int tipo_produto, String marca, int memoria, int quantidade) {
        this.tipo_produto = tipo_produto;
        this.nome = nome;
        this.marca = marca;
        this.memoria = memoria;
        this.quantidade = quantidade;
    }

    // Métodos Get
    public int getTipo_produto() {
        return tipo_produto;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public int getMemoria() {
        return memoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    // Métodos Set corrigidos
    public void setTipo_produto(int tipo_produto) {
        this.tipo_produto = tipo_produto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}