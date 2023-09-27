import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaOrdenada<Integer> lista = new ListaOrdenada<>();
        Random random = new Random();
        int numAleatorio;
        int posicion, tamano;


        for (int i = 0; i < 10; i++) {

            numAleatorio =random.nextInt(11);
            lista.add(numAleatorio);
        }
        System.out.println(lista.toString());

        posicion = EntradaTeclado.pedirEntero("Introduzca la posicion");

        if(posicion < 0 || posicion > lista.size() - 1){
            System.out.println("Posicion fuera del rango de la lista");
        }else {
            System.out.println("El elemento de la posicion " + posicion + " es: " + lista.get(posicion));
        }

        System.out.println("El tamano de la lista es " + lista.size());
        System.out.println(lista.remove(4) ? "Elemento eliminado correctamente" : "No esta el elemento en la lista");






    }
}