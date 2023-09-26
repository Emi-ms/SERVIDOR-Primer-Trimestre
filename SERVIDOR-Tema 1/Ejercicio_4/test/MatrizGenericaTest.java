import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MatrizGenericaTest {

    MatrizGenerica<Integer> matriz;

    @BeforeEach
    void setUp() {
        matriz = new MatrizGenerica<>(4, 4);
    }

    @Test
    @DisplayName("Inserta elemento en Matriz")
    void pruebaInsertaElemento() {
        assertTrue(matriz.set(2, 2, 4), "El elemento ha sido insertado correctamente");
    }

    @Test
    @DisplayName("No se inserta elemento en la Matriz")
    void pruebaNoInsertaElemento() {
        assertFalse(matriz.set(5, 2, 4), "No puede insertarse, fila fuera del tamano de la Matriz");
        assertFalse(matriz.set(2, 5, 4), "No puede insertarse, columna fuera del tamano de la Matriz");
        assertFalse(matriz.set(5, 5, 4), "No puede insertarse, fila y columna fuera del tamano de la Matriz");

    }

    @Test
    @DisplayName("Devuelve elemento correcto")
    void pruebaRetornoElementoCorrecto() {
        matriz.set(3, 3, 5);
        assertEquals(matriz.get(3, 3), 5, "Elemento esperado correcto");
    }
}
