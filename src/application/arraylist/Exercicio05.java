package application.arraylist;

import entities.arraylist.Evento;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Evento> eventos = new ArrayList<>();

        String resposta;
        do {
            System.out.println("Entre com os dados do evento");
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Data (dd/mm/aaaa): ");
            String data = sc.nextLine();

            System.out.print("Local: ");
            String local = sc.nextLine();

            Evento evento = getEvento(nome, data, local);
            eventos.add(evento);

            System.out.print("Deseja adicionar outro evento? (sim/sair): ");
            resposta = sc.nextLine();
        } while (!resposta.equals("sair"));

        System.out.println("\nEventos cadastrados:");
        for (Evento evento : eventos) {
            System.out.println(evento);
        }

        sc.close();
    }

    private static Evento getEvento(String nome, String data, String local) {
        Evento evento = new Evento();
        evento.setNome(nome);
        evento.setData(data);
        evento.setLocal(local);
        return evento;
    }
}
