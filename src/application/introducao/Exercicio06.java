package application.introducao;

import entities.introducao.Aluno;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Entre com os dados do aluno");

        System.out.print("Nome: ");
        aluno.nome = sc.nextLine();

        System.out.print("Idade: ");
        aluno.idade = sc.nextInt();

        System.out.print("Nota Final: ");
        aluno.notaFinal = sc.nextDouble();

        System.out.println(aluno);
    }
}
