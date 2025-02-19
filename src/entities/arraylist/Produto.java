package entities.arraylist;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double totalValor() {
        return preco * quantidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: R$ " + String.format("%.2f", preco) +
                ", Quantidade: " + quantidade +
                ", R$ Valor Total: R$ " + String.format("%.2f", totalValor());
    }
}