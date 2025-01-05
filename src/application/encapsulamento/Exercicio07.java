package application.encapsulamento;

import entities.encapsulamento.Funcionario;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do funcionário");

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Cargo: ");
        String cargo = sc.nextLine();

        System.out.print("Salário: ");
        double salario = sc.nextDouble();

        Funcionario funcionario = getFuncionario(nome, cargo, salario);

        System.out.println(funcionario);

        sc.close();
    }

    private static Funcionario getFuncionario(String nome, String cargo, double salario) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setSalario(salario);
        return funcionario;
    }
}