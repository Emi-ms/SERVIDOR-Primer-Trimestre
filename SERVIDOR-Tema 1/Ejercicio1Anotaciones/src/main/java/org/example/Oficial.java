package org.example;

public class Oficial extends Operario {
    private String categoria;


    public Oficial(String nombre, String apellidos, String direccion, String dni, Integer telefono, Integer codigoTaller, String categoria) {
        super(nombre, apellidos, direccion, dni, telefono, codigoTaller);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                "Categoria: " + categoria + '\'';
    }
}
