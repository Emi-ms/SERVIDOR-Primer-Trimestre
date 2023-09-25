import java.util.Objects;

public class Celda<T> implements Comparable<Celda<T>> {
    private int fila;
    private int columna;

    private T valor;

    public Celda(int fila, int columna, T elemento) {
        this.fila = fila;
        this.columna = columna;
        this.valor = elemento;
    }

    public Celda(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Celda<?> celda = (Celda<?>) o;
        return fila == celda.fila && columna == celda.columna;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fila, columna);
    }


    @Override
    public int compareTo(Celda<T> o) {
        int resultado = this.fila - o.fila;
        if (resultado == 0) {
            resultado = this.columna - o.columna;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": fila: " + fila +
                " - columna:" + columna +
                " - valor: " + valor.toString() +
                '\n';
    }
}
