package org.example;

public class Directivo extends Empleado {

    private int codigoDespacho;

    public Directivo(String nombre, String apellidos, String direccion, String dni, Integer telefono, int codigoDespacho) {
        super(nombre, apellidos, direccion, dni, telefono);
        this.codigoDespacho = codigoDespacho;
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }

    @Override
    public String toString() {
        return super.toString()
                + " - Codigo Despacho: " + codigoDespacho;
    }
}
