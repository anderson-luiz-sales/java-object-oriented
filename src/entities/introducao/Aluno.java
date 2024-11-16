package entities.introducao;

public class Aluno {

    public String nome;
    public int idade;
    public double notaFinal;

    public String situacao() {
        return notaFinal >= 6 ? "Aprovado" : "Reprovado";
    }

    public String toString() {
        return "Nome: " + nome +
                ", Idade: " + idade +
                ", Nota Final: " + String.format("%.2f", notaFinal) +
                ", Situação: " + situacao();
    }
}
