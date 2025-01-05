package entities.encapsulamento;

public class Curso {
    private String nome;
    private int cargaHoraria;
    private double valorMensalidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getValorMensalidade() {
        return valorMensalidade;
    }

    public void setValorMensalidade(double valorMensalidade) {
        this.valorMensalidade = valorMensalidade;
    }

    public double calcularValorTotal() {
        return cargaHoraria * valorMensalidade;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Carga Horária: " + cargaHoraria +
                ", Valor da Mensalidade: R$ " + String.format("%.2f", valorMensalidade) +
                ", Valor Total: R$ " + String.format("%.2f", calcularValorTotal());
    }
}