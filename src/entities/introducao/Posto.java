package entities.introducao;

public class Posto {

    public String combustivel;
    public double preco;
    public int litro;

    public double totalValor() {
        return preco * litro;
    }

    public String toString() {
        return combustivel +
                ", R$ " + String.format("%.2f", preco) +
                ", " + litro + ", R$ " +
                String.format("%.2f", totalValor());

    }
}
