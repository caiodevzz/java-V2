package List.FiltrarLista.exercio10.entities;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double perco, Integer quantidade) {
        this.nome = nome;
        this.preco = perco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
