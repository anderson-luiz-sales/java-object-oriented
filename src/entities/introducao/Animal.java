package entities.introducao;

public class Animal {

    public String nome;
    public int idade;
    public long numeroVacinal;

    public String toString() {
        return nome +
                ", " + idade +
                ", " + numeroVacinal;
    }
}
