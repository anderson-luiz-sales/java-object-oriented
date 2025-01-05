package application.encapsulamento;

import entities.encapsulamento.ProdutoEletronico;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do produto eletrônico");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Preço: ");
        double preco = sc.nextDouble();

        ProdutoEletronico produto = getProdutoEletronico(nome, marca, preco);

        System.out.print("Deseja aplicar um desconto de 10%? (s/n): ");
        char aplicarDesconto = sc.next().charAt(0);

        System.out.println(produto);
        if (aplicarDesconto == 's') {
            System.out.printf("Preço com Desconto: R$ %.2f%n", produto.calcularPrecoComDesconto());
        }

        sc.close();
    }

    private static ProdutoEletronico getProdutoEletronico(String nome, String marca, double preco) {
        ProdutoEletronico produto = new ProdutoEletronico();
        produto.setNome(nome);
        produto.setMarca(marca);
        produto.setPreco(preco);
        return produto;
    }
}