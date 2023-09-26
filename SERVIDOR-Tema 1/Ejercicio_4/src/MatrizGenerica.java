
import java.util.*;

public class MatrizGenerica<T> {

    private Set<Celda<T>> matriz;
    private final int MAX_FILAS;
    private final int MAX_COLUMNAS;

    public MatrizGenerica(int maxFilas, int maxColumnas) {
        this.matriz = new TreeSet<>();
        this.MAX_FILAS = maxFilas;
        this.MAX_COLUMNAS = maxColumnas;
    }

    public boolean set(int fila, int columna, T elemento) {
        if (fila > 0 && fila <= MAX_FILAS && columna > 0 && columna <= MAX_COLUMNAS) {
            return matriz.add(new Celda<T>(fila, columna, elemento));
        }

        return false;
    }

    public T get(int fila, int columna) {

        T elemento = null;
        Celda<T> entrada = new Celda<>(fila, columna);
        Celda<T> resultado = null;

        Iterator<Celda<T>> it = matriz.iterator();

        while (it.hasNext()) {
            Celda<T> celdaIt = it.next();
            if (celdaIt.equals(entrada)) {
                resultado = celdaIt;
            }
        }
        if (resultado != null) {
            elemento = resultado.getValor();
        }

        return elemento;
    }

    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();

        int contadorFila = 1;
        int contadorColumna = 1;
        T elemento = null;

        while (contadorFila < MAX_FILAS) {
            cadena.append("| ");
            while (contadorColumna < MAX_COLUMNAS) {
                elemento = get(contadorFila, contadorColumna);
                contadorColumna++;
                if(elemento == null){cadena.append(" | ");}else{
                cadena.append(elemento.toString()).append(" | ");}
            }
            contadorColumna = 1;
            contadorFila++;
            cadena.append("\n");
        }

        return cadena.toString();

    }

}