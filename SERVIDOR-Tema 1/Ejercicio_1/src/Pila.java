import java.util.LinkedList;
import java.util.List;

public class Pila<T> implements IColeccionSimpleGenerica<T> {

    private List<T> pila;

    public Pila() {
        this.pila = new LinkedList<>();
    }

    @Override
    public boolean estaVacia() {
        return pila.isEmpty();
    }

    @Override
    public T extraer() {
        return pila.remove(pila.size() - 1);
    }

    @Override
    public T primero() {
        return pila.get(pila.size() - 1);
    }

    @Override
    public boolean aniadir(T elemento) {
        return pila.add(elemento);

    }

    @Override
    public String toString() {

        StringBuilder cadena = new StringBuilder();

        for (int i = 0; i < pila.size(); i++) {
            cadena.append(pila.get(i).toString()).append(" - ");
        }
        return cadena.toString();
    }


}
