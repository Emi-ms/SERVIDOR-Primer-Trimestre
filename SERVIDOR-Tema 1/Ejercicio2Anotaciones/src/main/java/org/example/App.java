package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Empresa empresa = Empresa.cargadorDeContexto("Empresa 1");
        System.out.println(empresa.toString());




    }
}
