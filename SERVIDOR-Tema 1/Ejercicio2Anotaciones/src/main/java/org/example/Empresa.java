package org.example;

import org.example.anotation.aDirectivo;
import org.example.anotation.aOficial;
import org.example.anotation.aTecnico;

import java.util.ArrayList;
import java.util.List;


@aOficial(nombre = "Emiliano", apellidos = "Munoz", direccion = "C/America", dni = "1111111A", telefono = 12313132, codigoTaller = 4, categoria = "Oficial")
@aOficial(nombre = "Laura", apellidos = "Bravo", direccion = "C/America", dni = "222222A", telefono = 12313132, codigoTaller = 4, categoria = "Oficial")
@aTecnico(nombre = "Pepe", apellidos = "Navarro", codigoTaller = 3, direccion = "C/America", dni = "333333A", telefono = 12313132, perfil = "A")
@aTecnico(nombre = "Pepe", apellidos = "Navarro", codigoTaller = 3, direccion = "C/America", dni = "333333A", telefono = 12313132, perfil = "B")
@aTecnico(nombre = "Pepe", apellidos = "Navarro", codigoTaller = 3, direccion = "C/America", dni = "333333A", telefono = 12313132, perfil = "C")
@aDirectivo(nombre = "Pepe", apellidos = "Navarro", direccion = "C/America", dni = "333333A", telefono = 12313132, codigoDespacho = 343)
public class Empresa {

    private String nombre;
    private List<Empleado> empresa;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empresa = new ArrayList<>();
    }

    public Empresa() {
        this.empresa = new ArrayList<>();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void aniadirEmpleado(Empleado e) {

        empresa.add(e);
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder("Empresa " + nombre + '\n');

        for (Empleado e : empresa) {
            cadena.append(e.toString());
            cadena.append("\n");

        }
        return cadena.toString();
    }

    public static Empresa cargadorDeContexto(String nombre) {
        Empresa empresa = new Empresa(nombre);

        aDirectivo[] directivos = empresa.getClass().getAnnotationsByType(aDirectivo.class);
        aOficial[] oficiales = empresa.getClass().getAnnotationsByType(aOficial.class);
        aTecnico[] tecnicos = empresa.getClass().getAnnotationsByType(aTecnico.class);

        for (aDirectivo d : directivos) {
            empresa.aniadirEmpleado(new Directivo(d.nombre(), d.apellidos(), d.direccion(), d.dni(), d.telefono(), d.codigoDespacho()));
        }
        for (aOficial o : oficiales) {
            empresa.aniadirEmpleado(new Oficial(o.nombre(), o.apellidos(), o.direccion(), o.dni(), o.telefono(), o.codigoTaller(), o.categoria()));
        }
        for (aTecnico t : tecnicos) {
            empresa.aniadirEmpleado(new Tecnico(t.nombre(), t.apellidos(), t.direccion(), t.dni(), t.telefono(), t.codigoTaller(), t.perfil()));
        }

        return empresa;

    }
}
