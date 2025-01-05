package application.introducao;

import entities.introducao.Curso;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Curso curso = new Curso();

        System.out.println("Entre com os dados do curso");

        System.out.print("Nome: ");
        curso.nome = sc.nextLine();

        System.out.print("Carga Horária (em horas): ");
        curso.cargaHoraria = sc.nextInt();

        System.out.print("Valor da Mensalidade: ");
        curso.valorMensalidade = sc.nextDouble();

        System.out.println(curso);
    }
}