package entities.introducao;

public class Funcionario {

    public String nome;
    public String cargo;
    public double salario;

    public String toString() {
        return "Nome: " + nome +
                ", Cargo: " + cargo +
                ", Salário: R$ " + String.format("%.2f", salario);
    }
}