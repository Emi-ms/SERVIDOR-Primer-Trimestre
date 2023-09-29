package org.example.anotation;

import org.example.Tecnico;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Tecnicos.class)
public @interface aTecnico {
    String nombre();
    String apellidos();
    String direccion();
    String dni();
    int telefono();
    int codigoTaller();
    String perfil();





}
