package application.encapsulamento;

import entities.encapsulamento.Produto;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = sc.nextInt();

        Produto produto = getProduto(nome, preco, quantidade);

        System.out.println(produto);

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