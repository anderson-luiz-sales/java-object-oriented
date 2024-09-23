package aplication.introducao;

import entities.introducao.Produto;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto produto = new Produto();

        System.out.println("Entre com os dados do produto");

        System.out.println("Nome: ");
        produto.nome = sc.nextLine();

        System.out.println("Preço: ");
        produto.preco = sc.nextDouble();

        System.out.println("Quantidade: ");
        produto.quantidade = sc.nextInt();

        System.out.println(produto);
    }
}
