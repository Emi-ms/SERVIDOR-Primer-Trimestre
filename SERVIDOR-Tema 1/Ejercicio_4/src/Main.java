public class Main {
    public static void main(String[] args) {

        MatrizGenerica<Integer> matriz = new MatrizGenerica<>(5, 5);

        System.out.println(matriz.set(1, 4, 6));
        System.out.println(matriz.set(1, 4, 8));
        System.out.println(matriz.set(2, 4, 5));
        System.out.println(matriz.set(7, 3, 9));
        System.out.println(matriz.set(5, 2, 10));

        System.out.println(matriz.get(1,4));

        System.out.println(matriz.toString());


    }
}