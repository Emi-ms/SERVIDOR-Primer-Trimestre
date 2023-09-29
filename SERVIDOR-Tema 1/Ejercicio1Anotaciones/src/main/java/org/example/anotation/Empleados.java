package org.example.anotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Empleados {
    EmpleadoAnotation[] value();
}
