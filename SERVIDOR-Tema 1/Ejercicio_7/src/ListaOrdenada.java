import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {
    private List<E> listaOrdenada = new ArrayList();

    public ListaOrdenada() {
    }

    public void add(E elemento) {
        int indice;
        for(indice = 0; indice < this.listaOrdenada.size() && elemento.compareTo(this.listaOrdenada.get(indice)) > 0; ++indice) {
        }

        this.listaOrdenada.add(indice, elemento);
    }

    public E get(int index) {
        return this.listaOrdenada.get(index);
    }

    public int size() {
        return this.listaOrdenada.size();
    }

    public boolean isEmpty() {
        return this.listaOrdenada.isEmpty();
    }

    public boolean remove(E elemento) {
        return this.listaOrdenada.remove(elemento);
    }

    public int indexOf(E elemento) {
        return this.listaOrdenada.indexOf(elemento);
    }

    public String toString() {
        String cadena = "";

        Comparable elemento;
        for(Iterator var2 = this.listaOrdenada.iterator(); var2.hasNext(); cadena = cadena + elemento.toString() + " - ") {
            elemento = (Comparable)var2.next();
        }

        return cadena;
    }
}

