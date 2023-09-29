import java.io.PrintStream;
import java.util.Random;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada();
        Random random = new Random();

        for(int i = 0; i < 10; ++i) {
            int numAleatorio = random.nextInt(11);
            lista.add(numAleatorio);
        }

        System.out.println(lista.toString());
        int posicion = EntradaTeclado.pedirEntero("Introduzca la posicion");
        if (posicion >= 0 && posicion <= lista.size() - 1) {
            System.out.println("El elemento de la posicion " + posicion + " es: " + lista.get(posicion));
        } else {
            System.out.println("Posicion fuera del rango de la lista");
        }

        PrintStream var10000 = System.out;
        int var10001 = lista.size();
        var10000.println("El tamano de la lista es " + var10001);
        System.out.println(lista.remove(4) ? "Elemento eliminado correctamente" : "No esta el elemento en la lista");
    }
}
