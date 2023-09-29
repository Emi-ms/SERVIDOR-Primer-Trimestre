package org.example.anotations;

import java.awt.*;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Tareas.class)
public @interface aTarea {
    String titulo();
    String descripcion();
    String diaSemana();
    String hora();
}
