package entities.arraylist;

public class Estudante {
    private String nome;
    private int idade;
    private double nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String situacao() {
        return nota >= 7.0 ? "Aprovado" : "Reprovado";
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Nota: " + String.format("%.1f", nota) +
                ", Situação: " + situacao();
    }
}