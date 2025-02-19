package application.arraylist;

import entities.arraylist.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> itens = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Entre com os dados do item");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            Item item = getItem(nome, preco, quantidade);
            itens.add(item);

            System.out.print("Deseja adicionar outro item? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nItens cadastrados:");
        double valorTotal = 0.0;
        for (Item item : itens) {
            System.out.println(item);
            valorTotal += item.totalValor(); // Soma os valores totais dos itens
        }

        System.out.printf("\nValor total da compra: R$ %.2f\n", valorTotal);
        sc.close();
    }

    private static Item getItem(String nome, double preco, int quantidade) {
        Item item = new Item();
        item.setNome(nome);
        item.setPreco(preco);
        item.setQuantidade(quantidade);
        return item;
    }
}
