package entities.introducao;

public class Curso {

    public String nome;
    public int cargaHoraria;
    public double valorMensalidade;

    public String toString() {
        return "Nome: " + nome +
                ", Carga Horária: " + cargaHoraria +
                ", Valor da Mensalidade: R$ " + String.format("%.2f", valorMensalidade);
    }
}