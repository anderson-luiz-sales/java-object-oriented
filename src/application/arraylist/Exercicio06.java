package application.arraylist;

import entities.arraylist.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Entre com os dados do aluno");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Matrícula: ");
            String matricula = sc.nextLine();

            System.out.print("Curso: ");
            String curso = sc.nextLine();

            Aluno aluno = getAluno(nome, matricula, curso);
            alunos.add(aluno);

            System.out.print("Deseja adicionar outro aluno? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nAlunos cadastrados:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno);
        }

        sc.close();
    }

    private static Aluno getAluno(String nome, String matricula, String curso) {
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setMatricula(matricula);
        aluno.setCurso(curso);
        return aluno;
    }
}
