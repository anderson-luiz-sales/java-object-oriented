package entities.encapsulamento;

public class ProdutoEletronico {
    private String nome;
    private String marca;
    private double preco;

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

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double calcularPrecoComDesconto() {
        return preco * 0.90; // Aplica 10% de desconto
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Marca: " + marca + ", Preço: R$ " + String.format("%.2f", preco);
    }
}