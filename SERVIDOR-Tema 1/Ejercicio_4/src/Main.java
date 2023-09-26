import java.util.Collection;


public class Main {

    public static int menu() {
        int opcion;
        do {
            String cadena = "----- M E N U ------\n";
            cadena += "Opcion 1: Crear Matriz\n";
            cadena += "Opcion 2: Rellena Matriz\n";
            cadena += "Opcion 3: Mostrar Matriz\n";
            cadena += "Opcion 4: Mostrar un elemento de la Matriz\n";
            cadena += "Opcion 5: SALIR\n";

            System.out.println(cadena);
            opcion = EntradaTeclado.pedirEntero("Introduzca una opcion");
        } while (opcion < 1 || opcion > 5);

        return opcion;
    }

    public static void main(String[] args) {

        int opcion;
        MatrizGenerica<Integer> matriz = null;
        int filaLimite = 0;
        int columnaLimite = 0;
        do {

            opcion = menu();

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
                        System.out.println("Matriz rellenada correctamente.");
                    } else {
                        System.out.println("No ha sido posible rellenar la Matriz, primero debe crear una.");
                    }
                }

                case 3 -> {
                    if (matriz != null) {
                        System.out.println(matriz.toString());
                    } else {
                        System.out.println("No ha sido posible mostrar la Matriz, primero debe crear una.");
                    }
                }

                case 4 -> {
                    int fila = EntradaTeclado.pedirEntero("Indique la fila del elemento.");
                    int columna = EntradaTeclado.pedirEntero("Indique la columna del elemento.");

                    Integer elemento = matriz.get(fila, columna);
                    if (elemento != null) {
                        System.out.println("El elemento es: " + elemento);
                    } else {
                        System.out.println("En la posicion elegida no hay ningun elemento.");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo de la aplicacion...HASTA PRONTO!!!");
                }

                default -> {
                    System.out.println("Opcion no valida");
                }
            }

        } while (opcion != 5);
    }
}