package application.encapsulamento;

import entities.encapsulamento.Aluno;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluno");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();

        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();

        Aluno aluno = getAluno(nome, nota1, nota2);
        System.out.println(aluno);

        sc.close();
    }

    private static Aluno getAluno(String nome, double nota1, double nota2) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setNota1(nota1);
        aluno.setNota2(nota2);
        return aluno;
    }
}