public class Main {

    public static boolean esPar(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean esImpar(int num) {
        if (num % 2 != 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int numero;
        int maxPar = Integer.MIN_VALUE;
        int sumaImpares = 0;
        int contador = 0;
        double mediaImpares = 0;

        numero = EntradaTeclado.pedirEntero("Introduza un numero entero (-1 para terminar)");
        while (numero > 0) {
            contador++;

            if (esImpar(numero)) {
                sumaImpares += numero;
            }

            if (esPar(numero)) {
                if (numero > maxPar) {
                    maxPar = numero;
                }
            }

            numero = EntradaTeclado.pedirEntero("Introduza un numero entero (-1 para terminar)");

        }

        System.out.println("Se han introducido en total: " + contador + " numeros.");
        System.out.println("La media de los impares es: " + sumaImpares / contador);
        System.out.println("El maximo de los pares es: " + maxPar);
    }
}