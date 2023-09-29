package org.example;


import org.example.anotation.Empleados;

import static org.example.Empresa.cargadorDeContexto;

public class App
{
    public static void main( String[] args ){
        Empresa empresa = cargadorDeContexto("Mi empresa");
        System.out.println(empresa.toString());
    }
}
