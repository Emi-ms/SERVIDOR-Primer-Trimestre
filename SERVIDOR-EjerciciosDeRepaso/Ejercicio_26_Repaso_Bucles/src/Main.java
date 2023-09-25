import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String numero;
        Character digito, digitoActual;
        List<Integer> posiciones = new ArrayList<>();

        numero = EntradaTeclado.pedirCadena("Introduzca un numero");
        digito = EntradaTeclado.pedirChar("Introduzca un digito");



        for (int i = 0; i < numero.length() ; i++) {
           digitoActual = numero.charAt(i);
           if(digitoActual.equals(digito)){
               posiciones.add(i);
           }

        }

        for (int i = 0; i < posiciones.size(); i++) {
            System.out.println(posiciones.get(i));
        }
    }
}