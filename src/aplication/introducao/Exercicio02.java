package aplication.introducao;

import entities.introducao.Animal;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.println("Entre com os dados do animal");

        System.out.println("Nome: ");
        animal.nome = sc.nextLine();

        System.out.println("Idade: ");
        animal.idade = sc.nextInt();

        System.out.println("Numero da vacinal: ");
        animal.numeroVacinal = sc.nextInt();

        System.out.println(animal);
    }

}
