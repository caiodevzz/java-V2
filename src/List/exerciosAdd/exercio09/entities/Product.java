package List.exerciosAdd.exercio09.entities;

public class Product {
    private String nome;
    private int quantidade;
    private double preco;

    public Product(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Product(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double descontoPreco(double preco) {
        double taxaDesconto = 0.5;
        return preco * ( 1 - taxaDesconto);
    }

    public void informacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Preço: " + this.preco);
    }

}
