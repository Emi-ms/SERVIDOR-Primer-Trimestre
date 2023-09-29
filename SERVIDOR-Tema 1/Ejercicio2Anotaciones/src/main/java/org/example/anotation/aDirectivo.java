package org.example.anotation;

import org.example.Directivo;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Directivos.class)
public @interface aDirectivo {
    String nombre();
    String apellidos();
    String direccion();
    String dni();
    int telefono();
    int codigoDespacho();
}
