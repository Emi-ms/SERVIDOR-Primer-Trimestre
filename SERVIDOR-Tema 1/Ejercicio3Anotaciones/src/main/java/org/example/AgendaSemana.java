package org.example;

import org.example.anotations.aTarea;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@aTarea(titulo = "Servidor", descripcion = "Repaso de anotaciones", diaSemana = "Viernes", hora = "18:00")
@aTarea(titulo = "Cliente", descripcion = "Repaso de JS", diaSemana = "Viernes", hora = "20:00")
@aTarea(titulo = "Diseño Interfaz", descripcion = "Practicar Figma", diaSemana = "Sabado", hora = "10:30")
@aTarea(titulo = "Despliegue", descripcion = "Aprender a usar Postman", diaSemana = "Sabado", hora = "12:00")
@aTarea(titulo = "Ingles", descripcion = "Preparar presentacion", diaSemana = "Domingo", hora = "11:00")
@aTarea(titulo = "Servidor", descripcion = "Leer apuntes sobre Stream", diaSemana = "Domingo", hora = "18:00")
public class AgendaSemana {
    private List<Tarea> agenda;

    public AgendaSemana() {
        this.agenda = new ArrayList<>();
    }

    public boolean add(Tarea t) {
        return agenda.add(t);
    }

    @Override
    public String toString() {

        StringBuilder cadena = new StringBuilder();

        for (Tarea t : agenda
        ) {
            cadena.append(t.toString()).append("\n");
        }
        return cadena.toString();
    }

    public static AgendaSemana cargaAgenda() {
        AgendaSemana agenda = new AgendaSemana();

        aTarea[] tareas = agenda.getClass().getAnnotationsByType(aTarea.class);

        Arrays.stream(tareas).forEach(t -> agenda.add(new Tarea(t.titulo(),t.descripcion(),t.diaSemana(),t.hora())));

//        for (aTarea t : tareas) {
//            agenda.add(new Tarea(t.titulo(), t.descripcion(), t.diaSemana(), t.hora()));
//
//        }
        return agenda;
    }
}