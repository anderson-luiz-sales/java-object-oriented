package entities.introducao;

public class Pessoa {

    public long cpf;
    public String nome;
    public String dataNascimento;
    public String endereco;

    public String toString() {
        return cpf +
                ", " + nome +
                ", " + dataNascimento +
                ", " + endereco;
    }
}
