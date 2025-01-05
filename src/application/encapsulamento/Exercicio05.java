package application.encapsulamento;

import entities.encapsulamento.Cliente;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do cliente");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldo = sc.nextDouble();

        Cliente cliente = getCliente(nome, cpf, saldo);

        System.out.println("Cliente cadastrado: " + cliente);

        System.out.print("Valor do depósito: ");
        double valorDeposito = sc.nextDouble();
        cliente.depositar(valorDeposito);
        System.out.printf("Depósito realizado. Saldo atual: R$ %.2f%n", cliente.getSaldo());

        sc.close();
    }

    private static Cliente getCliente(String nome, String cpf, double saldo) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setSaldo(saldo);
        return cliente;
    }
}