package application.introducao;

import entities.introducao.LivroAvaliacao;

import java.util.Scanner;

public class AvaliacaoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o preço do livro: ");
        double preco = scanner.nextDouble();

        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = scanner.nextInt();

        LivroAvaliacao livro = new LivroAvaliacao(titulo, autor, preco, quantidade);
        System.out.println(livro);

        scanner.close();
    }
}
