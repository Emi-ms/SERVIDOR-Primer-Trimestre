package org.example.anotation;

import org.example.Empleado;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
public @interface EmpleadoAnotation {
    String nombre();

    String apellidos();

    String dni();

    String direccion();

    int telefono();

    String clase();

    int codigoDespacho() default 1;

    int codigoTaller() default 1;

    String perfil() default "";

    String categoria() default "";

}
