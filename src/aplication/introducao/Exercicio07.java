package aplication.introducao;

import entities.introducao.Livro;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro livro = new Livro();

        System.out.println("Entre com os dados do livro");

        System.out.print("Título: ");
        livro.titulo = sc.nextLine();

        System.out.print("Autor: ");
        livro.autor = sc.nextLine();

        System.out.print("Número de Páginas: ");
        livro.numeroPaginas = sc.nextInt();

        System.out.println(livro);
    }
}