package org.example;

public class Tecnico extends Operario {
    private String perfil;

    public Tecnico(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller, String perfil) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Perfil:" + perfil + '\'';
    }
}
