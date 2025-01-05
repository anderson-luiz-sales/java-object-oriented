package application.encapsulamento;

import entities.encapsulamento.Jogo;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do jogo: ");
        String nome = sc.nextLine();

        System.out.println("Informa o ano de lançamento do jogo: ");
        int anoLacamento = sc.nextInt();

        System.out.println("Informe o valor do jogo: ");
        double valor = sc.nextDouble();

        Jogo jogo = getJogo(nome, anoLacamento, valor);

        if (jogo.getAnoLancamento() > 2010) {
            System.out.println("O jogo é atual: ");
        } else {
            System.out.println("O jogo é antigo: ");
        }

        System.out.println(jogo);

        sc.close();
    }

    private static Jogo getJogo(String nome, int anoLacamento, double valor) {
        Jogo jogo = new Jogo();
        jogo.setNome(nome);
        jogo.setAnoLancamento(anoLacamento);
        jogo.setValor(valor);
        return jogo;
    }
}
