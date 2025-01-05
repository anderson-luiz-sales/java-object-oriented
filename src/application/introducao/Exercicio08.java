package application.introducao;

import entities.introducao.Funcionario;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();

        System.out.println("Entre com os dados do funcionário");

        System.out.print("Nome: ");
        funcionario.nome = sc.nextLine();

        System.out.print("Cargo: ");
        funcionario.cargo = sc.nextLine();

        System.out.print("Salário: ");
        funcionario.salario = sc.nextDouble();

        System.out.println(funcionario);
    }
}