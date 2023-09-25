public class PilaArray<T> implements IColeccionSimpleGenerica<T> {

    private T[] pila;
    private int numElementos;

    public PilaArray() {
        this.pila = (T[]) new Object[10];
        this.numElementos = 0;
    }

    @Override
    public boolean estaVacia() {
        return numElementos == 0;
    }

    @Override
    public T extraer() {
        if (estaVacia()) {
            return null;
        }
        T elemento = pila[numElementos - 1];
        numElementos--;
        return elemento;
    }

    @Override
    public T primero() {
        if (estaVacia()) {
            return null;
        }
        return pila[numElementos - 1];
    }

    @Override
    public boolean aniadir(T elemento) {
        if (numElementos < pila.length) {
            pila[numElementos++] = elemento;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {

        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < numElementos; i++) {
            cadena.append(pila[i].toString()).append(" - ");
        }
        return cadena.toString();
    }
}
