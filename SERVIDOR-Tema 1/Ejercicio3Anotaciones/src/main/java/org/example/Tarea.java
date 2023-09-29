package org.example;

import java.util.Date;

public class Tarea {
    private String titulo;
    private String descripcion;
    private String diaSemana;
    private String hora;

    public Tarea(String titulo, String descripcion, String diaSemana, String hora) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.diaSemana = diaSemana;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Tarea" +
                " Titulo: " + titulo +
                " - Descripcion: " + descripcion +
                " - Dia: " + diaSemana +
                " - Hora: " + hora;
    }
}
