package org.example;

public class Operario extends Empleado {

    private Integer codigoTaller;

    public Operario(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoTaller = codigoTaller;
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }

    @Override
    public String toString() {
        return super.toString() + '\'';
    }
}
