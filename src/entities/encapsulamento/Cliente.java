package entities.encapsulamento;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Saldo: R$ " + String.format("%.2f", saldo);
    }
}