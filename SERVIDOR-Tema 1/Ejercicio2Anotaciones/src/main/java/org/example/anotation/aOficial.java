package org.example.anotation;

import org.example.Oficial;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Oficiales.class)
public @interface aOficial {
    String nombre();
    String apellidos();
    String direccion();
    String dni();
    int telefono();
    int codigoTaller();

    String categoria();


}
