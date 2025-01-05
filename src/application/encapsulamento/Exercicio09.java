package application.encapsulamento;

import entities.encapsulamento.Curso;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Coletar informações do curso
        System.out.println("Entre com os dados do curso");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Carga Horária: ");
        int cargaHoraria = sc.nextInt();

        System.out.print("Valor da Mensalidade: ");
        double valorMensalidade = sc.nextDouble();

        Curso curso = getCurso(nome, cargaHoraria, valorMensalidade);

        System.out.println(curso);

        sc.close();
    }

    private static Curso getCurso(String nome, int cargaHoraria, double valorMensalidade) {
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setCargaHoraria(cargaHoraria);
        curso.setValorMensalidade(valorMensalidade);
        return curso;
    }
}