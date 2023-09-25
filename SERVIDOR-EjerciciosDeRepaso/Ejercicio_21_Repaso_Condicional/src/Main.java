// Calcula la nota de un trimestre de la asignatura Programación.
// El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
//
//Si la media de los dos controles da un número mayor o igual a 5,
// el alumno está aprobado y se mostrará la media.
// En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen
// de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario
//¿Cuál ha sido el resultado de la recuperación? (apto/no apto).
// Si el resultado de la recuperación es apto, la nota será un 5;
// en caso contrario, se mantiene la nota media anterior.
public class Main {
    public static void main(String[] args) {

        double nota1, nota2, notaFinal;
        String recuperacion;

        do {
            nota1 = EntradaTeclado.pedirDoble("Introduzca la nota del primer trimestre");
        } while (nota1 < 0 || nota1 > 10);
        do {
            nota2 = EntradaTeclado.pedirDoble("Introduzca la nota del segundo trimestre");
        } while (nota1 < 0 || nota1 > 10);

        notaFinal = (nota1 + nota2) / 2;

        if (notaFinal >= 5) {
            System.out.println("Tu nota de programacion es: " + notaFinal);
        } else {
            recuperacion = EntradaTeclado.pedirCadena("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            if (recuperacion.equalsIgnoreCase("apto")) {
                System.out.println("Tu nota en programacion es: 5");
            } else {
                System.out.println("Tu nota de programacion es: " + notaFinal);
            }
        }


    }
}
