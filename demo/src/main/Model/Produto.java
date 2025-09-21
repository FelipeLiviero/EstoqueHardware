public class Produto {
    private int codigo;
    private int tipo_produto;
    private String marca;
    private int memoria;
    private int quantidade;

    public Produto(int codigo, int tipo_produto, String marca, int memoria, int quantidade) {
        this.codigo = codigo;
        this.tipo_produto = tipo_produto;
        this.marca = marca;
        this.memoria = memoria;
        this.quantidade = quantidade;
    }

    // Métodos Get
    public int getCodigo() {
        return codigo;
    }

    public int getTipo_produto() {
        return tipo_produto;
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
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTipo_produto(int tipo_produto) {
        this.tipo_produto = tipo_produto;
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