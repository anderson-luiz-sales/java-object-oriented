package application.arraylist;

import entities.arraylist.Veiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Veiculo> veiculos = new ArrayList<>();
        final double PRECO_COMBUSTIVEL = 5.00; // Preço do combustível por litro

        String resposta;
        do {
            System.out.println("Entre com os dados do veículo");
            System.out.print("Modelo: ");
            String modelo = sc.nextLine();

            System.out.print("Consumo (km/l): ");
            double consumo = sc.nextDouble();

            System.out.print("Quilômetros percorridos: ");
            double quilometrosPercorridos = sc.nextDouble();
            sc.nextLine(); // Consumir a quebra de linha pendente

            Veiculo veiculo = getVeiculo(modelo, consumo, quilometrosPercorridos);
            veiculos.add(veiculo);

            System.out.print("Deseja adicionar outro veículo? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nVeículos cadastrados:");
        double custoTotal = 0.0;
        for (Veiculo veiculo : veiculos) {
            System.out.println(veiculo);
            custoTotal += veiculo.calcularCustoTotal(PRECO_COMBUSTIVEL); // Soma os custos totais de operação
        }

        System.out.printf("\nCusto total de operação de todos os veículos: R$ %.2f\n", custoTotal);
        sc.close();
    }

    private static Veiculo getVeiculo(String modelo, double consumo, double quilometrosPercorridos) {
        Veiculo veiculo = new Veiculo();
        veiculo.setModelo(modelo);
        veiculo.setConsumo(consumo);
        veiculo.setQuilometrosPercorridos(quilometrosPercorridos);
        return veiculo;
    }
}
