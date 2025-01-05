package entities.encapsulamento;

public class Jogo {

    private String nome;
    private int anoLancamento;
    private double valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Nome: " + nome +
                ", Ano de lançamento: " + anoLancamento +
                ", Valor: R$ " + String.format("%.2f", valor);
    }

}
