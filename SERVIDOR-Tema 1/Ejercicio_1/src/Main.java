
public class Main {
    public static void main(String[] args) {

        Pila<Integer> pilaList = new Pila<>();
        pilaList.aniadir(1);
        pilaList.aniadir(2);
        pilaList.aniadir(3);
        pilaList.aniadir(4);
        pilaList.aniadir(5);
        pilaList.aniadir(6);

        System.out.println("Los elementos de la lista son: " + pilaList.toString());
        System.out.println("La pila esta vacia: " + pilaList.estaVacia());
        Integer numEliminado = pilaList.extraer();
        System.out.println("El numero eliminado es: " + numEliminado.toString());
        System.out.println("Los elementos de la listas son: " + pilaList.toString());
        Integer numPrimero = pilaList.primero();
        System.out.println("El primer numero es el: " + numPrimero);

        System.out.println("----------------------------------------------------------");

        PilaArray<Integer> pilaArray = new PilaArray<>();
        pilaArray.aniadir(1);
        pilaArray.aniadir(2);
        pilaArray.aniadir(3);
        pilaArray.aniadir(4);
        pilaArray.aniadir(5);
        pilaArray.aniadir(6);


        System.out.println("Los elementos de la lista son: " + pilaArray.toString());
        System.out.println("La pila esta vacia: " + pilaArray.estaVacia());
        Integer numEliminadoArray = pilaArray.extraer();
        System.out.println("El numero eliminado es: " + numEliminadoArray.toString());
        System.out.println("Los elementos de la listas son: " + pilaArray.toString());
        Integer numPrimeroArray = pilaArray.primero();
        System.out.println("El primer numero es el: " + numPrimeroArray);
    }


}