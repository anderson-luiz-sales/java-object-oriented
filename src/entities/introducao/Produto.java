package entities.introducao;

public class Produto {

    public String nome;
    public double preco;
    public int quantidade;

    public double totalValor() {
        return preco * quantidade;
    }

    public String toString() {
        return nome +
                ", R$ " + String.format("%.2f", preco) +
                ", " + quantidade + ", R$ " +
                String.format("%.2f", totalValor());
    }
}
