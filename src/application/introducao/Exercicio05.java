package application.introducao;

import entities.introducao.Posto;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Posto posto = new Posto();

        System.out.println("Entre com os dados do posto");

        System.out.println("Combustivel: ");
        posto.combustivel = sc.nextLine();

        System.out.println("Preço: ");
        posto.preco = sc.nextDouble();

        System.out.println("Preço: ");
        posto.litro = sc.nextInt();

        System.out.println(posto);
    }
}
