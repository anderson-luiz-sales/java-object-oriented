package application.introducao;

import entities.introducao.Medicamento;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Medicamento medicamento = new Medicamento();

        System.out.println("Entre com os dados do medicamento");

        System.out.println("Código: ");
        medicamento.codigo = sc.nextInt();
        sc.nextLine();

        System.out.println("Nome: ");
        medicamento.nome = sc.nextLine();

        System.out.println("Quantidade: ");
        medicamento.quantidade = sc.nextInt();

        System.out.println("Preço: ");
        medicamento.preco = sc.nextDouble();

        System.out.println(medicamento);
    }
}
