package entities.introducao;

public class Medicamento {

    public long codigo;
    public String nome;
    public int quantidade;
    public double preco;

    public double totalValor() {
        return preco * quantidade;
    }

    public String toString() {
        return codigo +
                ", " + nome +
                ", R$ " + String.format("%.2f", preco) +
                ", " + quantidade + ", R$ " +
                String.format("%.2f", totalValor());

    }
}
