import java.util.Collection;


public class Main {

    public static int menu() {
        int opcion;


        String cadena = "----- M E N U ------\n";
        cadena += "Opcion 1: Crear Matriz\n";
        cadena += "Opcion 2: Rellena Matriz\n";
        cadena += "Opcion 3: Mostrar Matriz\n";
        cadena += "Opcion 4: Mostrar un elemento de la Matriz\n";
        do {
            System.out.println(cadena);
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion");
        } while (opcion < 1 || opcion > 4);


        return opcion;
    }

    public static void main(String[] args) {
        String terminar = "";
        do {


            int opcion = menu();
            MatrizGenerica<Integer> matriz = null;
            int filaLimite = 0;
            int columnaLimite = 0;

            switch (opcion) {

                case 1 -> {
                    filaLimite = EntradaTeclado.pedirEntero("Introduzca el numero maximo de filas") + 1;
                    columnaLimite = EntradaTeclado.pedirEntero("Introduzca el numero maximo de columnas") + 1;

                    matriz = new MatrizGenerica<>(filaLimite, columnaLimite);
                }

                case 2 -> {
                    if (matriz != null) {
                        int contadorFila = 1;
                        int contadorColumna = 1;
                        int elementoNum = 1;

                        while (contadorFila < filaLimite) {

                            while (contadorColumna < columnaLimite) {
                                matriz.set(contadorFila, contadorColumna, elementoNum);
                                contadorColumna++;
                                elementoNum++;
                            }
                            contadorColumna = 1;
                            contadorFila++;
                        }

                    }
                }

                case 3 -> System.out.println(matriz.toString());

                case 4 -> {
                    int fila = EntradaTeclado.pedirEntero("Indique la fila del elemento");
                    int columna = EntradaTeclado.pedirEntero("Indique la columna del elemento");

                    int elemento = matriz.get(fila, columna);
                    System.out.println("El elemento es: " + elemento);
                }
            }

            terminar = EntradaTeclado.pedirCadena("Pulse S para terminar, otra tecla para continuar");
        } while (terminar.equalsIgnoreCase("S"));
    }
}