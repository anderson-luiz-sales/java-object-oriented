package application.arraylist;

import entities.arraylist.Estudante;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Estudante> estudantes = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Entre com os dados do estudante");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade: ");
            int idade = sc.nextInt();

            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha pendente

            Estudante estudante = getEstudante(nome, idade, nota);
            estudantes.add(estudante);

            System.out.print("Deseja adicionar outro estudante? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nEstudantes cadastrados:");
        for (Estudante estudante : estudantes) {
            System.out.println(estudante);
        }

        sc.close();
    }

    private static Estudante getEstudante(String nome, int idade, double nota) {
        Estudante estudante = new Estudante();
        estudante.setNome(nome);
        estudante.setIdade(idade);
        estudante.setNota(nota);
        return estudante;
    }
}
