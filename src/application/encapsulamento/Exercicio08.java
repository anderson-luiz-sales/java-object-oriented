package application.encapsulamento;

import entities.encapsulamento.Veiculo;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do veículo");

        System.out.print("Modelo: ");
        String modelo = sc.nextLine();

        System.out.print("Marca: ");
        String marca = sc.nextLine();

        System.out.print("Ano de Fabricação: ");
        int anoFabricacao = sc.nextInt();

        Veiculo veiculo = getVeiculo(modelo, marca, anoFabricacao);

        System.out.println(veiculo);

        sc.close();
    }

    private static Veiculo getVeiculo(String modelo, String marca, int anoFabricacao) {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(modelo);
        veiculo.setMarca(marca);
        veiculo.setAnoFabricacao(anoFabricacao);
        return veiculo;
    }
}