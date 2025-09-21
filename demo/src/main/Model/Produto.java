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

    // Metodos Get
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

    //Metodos Set
    public void setCodigo() {
        this.codigo = codigo;
    }

    public void setTipo_produto() {
        this.tipo_produto = tipo_produto;
    }

    public void setMarca() {
        this.marca = marca;
    }

    public void setMemoria() {
        this.memoria = memoria;
    }

    public void setQuantidade () {
        this.quantidade = quantidade;
    }
}
