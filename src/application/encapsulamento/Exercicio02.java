package application.encapsulamento;

import entities.encapsulamento.Filme;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o título do filme: ");
        String titulo = sc.nextLine();

        System.out.println("Informe o ano de lançamento: ");
        int anoLancamento = sc.nextInt();

        System.out.println("Informe a duração (em minutos): ");
        int duracao = sc.nextInt();

        Filme filme = getFilme(titulo, anoLancamento, duracao);

        if (filme.getAnoLancamento() > 2000) {
            System.out.println("O filme é recente:");
        } else {
            System.out.println("O filme é clássico:");
        }

        System.out.println(filme);

        sc.close();
    }

    private static Filme getFilme(String titulo, int anoLancamento, int duracao) {
        Filme filme = new Filme();
        filme.setTitulo(titulo);
        filme.setAnoLancamento(anoLancamento);
        filme.setDuracao(duracao);
        return filme;
    }
}