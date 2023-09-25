import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaTeclado {


    private static Scanner teclado;

    public EntradaTeclado() {
    }

    public static int pedirEntero(String mensaje) {
        int num = 0;

        boolean error;
        do {
            try {
                error = false;
                System.out.println(mensaje);
                num = teclado.nextInt();
            } catch (InputMismatchException var7) {
                System.out.println("Dato introducido erróneo");
                error = true;
            } finally {
                teclado.nextLine();
            }
        } while (error);

        return num;
    }

    public static double pedirDoble(String mensaje) {
        double num = 0.0;

        boolean error;
        do {
            try {
                error = false;
                System.out.println(mensaje);
                num = teclado.nextDouble();
            } catch (InputMismatchException var8) {
                System.out.println("Dato introducido erróneo");
                error = true;
            } finally {
                teclado.nextLine();
            }
        } while (error);

        return num;
    }

    public static float pedirFloat(String mensaje) {
        float num = 0.0F;

        boolean error;
        do {
            try {
                error = false;
                System.out.println(mensaje);
                num = teclado.nextFloat();
            } catch (InputMismatchException var7) {
                System.out.println("Dato introducido erróneo");
                error = true;
            } finally {
                teclado.nextLine();
            }
        } while (error);

        return num;
    }

    public static long pedirLong(String mensaje) {
        long num = 0L;

        boolean error;
        do {
            try {
                error = false;
                System.out.println(mensaje);
                num = teclado.nextLong();
            } catch (InputMismatchException var8) {
                System.out.println("Dato introducido erróneo");
                error = true;
            } finally {
                teclado.nextLine();
            }
        } while (error);

        return num;
    }

    public static char pedirChar(String mensaje) {
        String input = "";

        do {
            System.out.println(mensaje);
            input = teclado.nextLine();
        } while (input.length() == 0);

        return input.charAt(0);
    }

    public static String pedirCadena(String mensaje) {
        String cad = "";
        System.out.println(mensaje);
        cad = teclado.nextLine();
        teclado.nextLine();
        return cad;
    }

    static {
        teclado = new Scanner(System.in);
    }
}


