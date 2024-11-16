package aplication.introducao;

import entities.introducao.Veiculo;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();

        System.out.println("Entre com os dados do veículo");

        System.out.print("Modelo: ");
        veiculo.modelo = sc.nextLine();

        System.out.print("Marca: ");
        veiculo.marca = sc.nextLine();

        System.out.print("Ano de Fabricação: ");
        veiculo.anoFabricacao = sc.nextInt();

        System.out.println(veiculo);
    }
}