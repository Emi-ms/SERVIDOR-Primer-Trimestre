public class Main {
    public static void main(String[] args) {
        int altura;
        int terraza = 6;
        int incremento = 4;
        final int ESCALERA = 4;
        StringBuilder salida = new StringBuilder();

        do {
            altura = EntradaTeclado.pedirEntero("Introduzca la altura de la piramide");
        }while (altura <= 3);

        for (int fila = 0; fila < altura; fila++) {

            if (fila % 2 != 0) {

                for (int i = altura - fila; i > 0; i--) {
                    salida.append(" ");
                }

                for (int i = 0; i < terraza; i++) {
                    salida.append("*");
                }
                terraza += incremento;
            } else {

                for (int i = altura - fila; i > 0; i--) {
                    salida.append(" ");
                }

                for (int i = 0; i < fila; i++) {
                    salida.append("*");
                }
                for (int i = 0; i < ESCALERA; i++) {
                    salida.append(" ");
                }
                for (int i = 0; i < fila; i++) {
                    salida.append("*");
                }

            }

            salida.append("\n");
        }

        System.out.println(salida);
    }
}