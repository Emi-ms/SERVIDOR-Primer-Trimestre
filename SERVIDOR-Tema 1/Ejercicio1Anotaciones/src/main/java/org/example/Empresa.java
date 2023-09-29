package org.example;

import org.example.anotation.EmpleadoAnotation;
import org.example.anotation.Empleados;

import java.util.ArrayList;
import java.util.List;


@EmpleadoAnotation(nombre = "Emiliano", apellidos = "Munoz", codigoDespacho = 3, direccion = "C/America", dni = "1111111A", telefono = 12313132, clase = "Oficial")
@EmpleadoAnotation(nombre = "Laura", apellidos = "Bravo", codigoTaller = 3, direccion = "C/America", dni = "222222A", telefono = 12313132, perfil = "sfdsa", clase = "Tecnico")
@EmpleadoAnotation(nombre = "Pepe", apellidos = "Navarro", codigoTaller = 3, direccion = "C/America", dni = "333333A", telefono = 12313132, clase = "Directivo")
public class Empresa {

    private final static String DIRECTIVO = "Directivo";
    private final static String OFICIAL = "Oficial";
    private final static String TECNICO = "Tecnico";
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
        StringBuilder cadena = new StringBuilder("Empresa " + nombre + '\'');

        for (Empleado e : empresa) {
            cadena.append(e.toString());
            cadena.append("\n");

        }
        return cadena.toString();
    }

    public static Empresa cargadorDeContexto(String nombre) {
        Empresa empresa = new Empresa(nombre);

        EmpleadoAnotation[] anotadoEmpleados = Empresa.class.getAnnotationsByType(EmpleadoAnotation.class);// o empresa.getClass().getAnnotationsByType(EmpleadoAnotation.class)

        for (EmpleadoAnotation anotadoEmpleado : anotadoEmpleados) {

            if (Empresa.DIRECTIVO.equals(anotadoEmpleado.clase())) {
                System.out.println(Empresa.DIRECTIVO);
                Directivo directivo = new Directivo(anotadoEmpleado.nombre()
                        , anotadoEmpleado.apellidos()
                        , anotadoEmpleado.direccion()
                        , anotadoEmpleado.dni()
                        , anotadoEmpleado.telefono()
                        , anotadoEmpleado.codigoDespacho());
                empresa.aniadirEmpleado(directivo);
            } else if (Empresa.OFICIAL.equals(anotadoEmpleado.clase())) {
                System.out.println(Empresa.OFICIAL);
                Oficial oficial = new Oficial(anotadoEmpleado.nombre()
                        , anotadoEmpleado.apellidos()
                        , anotadoEmpleado.direccion()
                        , anotadoEmpleado.dni()
                        , anotadoEmpleado.telefono()
                        , anotadoEmpleado.codigoTaller()
                        , anotadoEmpleado.categoria());

                empresa.aniadirEmpleado(oficial);
            } else if (Empresa.TECNICO.equals(anotadoEmpleado.clase())) {
                System.out.println(Empresa.TECNICO);
                Tecnico tecnico = new Tecnico(anotadoEmpleado.nombre()
                        , anotadoEmpleado.apellidos()
                        , anotadoEmpleado.direccion()
                        , anotadoEmpleado.dni()
                        , anotadoEmpleado.telefono()
                        , anotadoEmpleado.codigoTaller()
                        , anotadoEmpleado.perfil());
                empresa.aniadirEmpleado(tecnico);
            }
        }
        return empresa;

    }
}
