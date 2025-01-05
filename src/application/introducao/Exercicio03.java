package application.introducao;

import entities.introducao.Pessoa;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Entre com os dados da pessoa");

        System.out.println("cpf: ");
        pessoa.cpf = sc.nextLong();
        sc.nextLine();

        System.out.println("Nome: ");
        pessoa.nome = sc.nextLine();

        System.out.println("Data de nascimento: ");
        pessoa.dataNascimento = sc.nextLine();

        System.out.println("Endereço: ");
        pessoa.endereco = sc.nextLine();

        System.out.println(pessoa);
    }
}
