package application.encapsulamento;

import entities.encapsulamento.Livro;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do livro");

        System.out.print("Título: ");
        String titulo = sc.nextLine();

        System.out.print("Autor: ");
        String autor = sc.nextLine();

        System.out.print("Número de Páginas: ");
        int numeroPaginas = sc.nextInt();

        Livro livro = getLivro(titulo, autor, numeroPaginas);

        System.out.println(livro);

        sc.close();
    }

    private static Livro getLivro(String titulo, String autor, int numeroPaginas) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setNumeroPaginas(numeroPaginas);
        return livro;
    }
}