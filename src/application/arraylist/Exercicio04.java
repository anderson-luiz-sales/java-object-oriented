package application.arraylist;

import entities.arraylist.Livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Livro> livros = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Entre com os dados do livro");
            System.out.print("Título: ");
            String titulo = sc.nextLine();

            System.out.print("Autor: ");
            String autor = sc.nextLine();

            System.out.print("Ano de Publicação: ");
            int anoPublicacao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            Livro livro = getLivro(titulo, autor, anoPublicacao);
            livros.add(livro);

            System.out.print("Deseja adicionar outro livro? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nLivros cadastrados:");
        for (Livro livro : livros) {
            System.out.println(livro);
        }

        sc.close();
    }

    private static Livro getLivro(String titulo, String autor, int anoPublicacao) {
        Livro livro = new Livro();
        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAnoPublicacao(anoPublicacao);
        return livro;
    }
}
