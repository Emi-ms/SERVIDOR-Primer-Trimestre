package org.example;


public class App {
    public static void main(String[] args) {

        AgendaSemana agenda = AgendaSemana.cargaAgenda();
        System.out.println(agenda.toString());

    }
}
