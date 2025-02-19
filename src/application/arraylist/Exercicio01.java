package application.arraylist;

import entities.arraylist.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Produto> produtos = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Entre com os dados do produto");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha pendente

            Produto produto = getProduto(nome, preco, quantidade);
            produtos.add(produto);

            System.out.print("Deseja adicionar outro produto? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nProdutos cadastrados:");
        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        sc.close();
    }

    private static Produto getProduto(String nome, double preco, int quantidade) {
        Produto produto = new Produto();
        produto.setNome(nome);
        produto.setPreco(preco);
        produto.setQuantidade(quantidade);
        return produto;
    }
}