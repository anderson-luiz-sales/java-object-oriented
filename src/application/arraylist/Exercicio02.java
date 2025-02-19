package application.arraylist;

import entities.arraylist.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Jogo> jogos = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Informe o nome do jogo: ");
            String nome = sc.nextLine();

            System.out.println("Informe o ano de lançamento do jogo: ");
            int anoLancamento = sc.nextInt();

            System.out.println("Informe o valor do jogo: ");
            double valor = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha pendente

            Jogo jogo = getJogo(nome, anoLancamento, valor);
            jogos.add(jogo); // Adiciona o jogo à lista

            System.out.print("Deseja cadastrar outro jogo? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        // Exibe todos os jogos cadastrados
        System.out.println("\nJogos cadastrados:");
        for (Jogo jogo : jogos) {
            System.out.println(jogo);
        }

        sc.close();
    }

    private static Jogo getJogo(String nome, int anoLancamento, double valor) {
        Jogo jogo = new Jogo();
        jogo.setNome(nome);
        jogo.setAnoLancamento(anoLancamento);
        jogo.setValor(valor);
        return jogo;
    }
}