import java.util.ArrayList;
import java.util.List;

public class ListaOrdenada<E extends Comparable<E>> {
    private List<E> listaOrdenada;

    public ListaOrdenada() {
        this.listaOrdenada = new ArrayList<>();
    }

    public void add(E elemento) {
        int indice = 0;

        while (indice < listaOrdenada.size() && elemento.compareTo(listaOrdenada.get(indice)) > 0) {
            indice++;
        }
        listaOrdenada.add(indice, elemento);
    }

    public E get(int index) {
        return listaOrdenada.get(index);
    }

    public int size(){
        return listaOrdenada.size();
    }

    public boolean isEmpty() {
        return listaOrdenada.isEmpty();
    }

    public boolean remove(E elemento) {
        return listaOrdenada.remove(elemento);
    }

    public int indexOf(E elemento) {
        return listaOrdenada.indexOf(elemento);
    }

    @Override
    public String toString() {
        String cadena = "";

        for (E elemento : listaOrdenada) {
            cadena += elemento.toString() + " - ";
        }
        return cadena;
    }

}
