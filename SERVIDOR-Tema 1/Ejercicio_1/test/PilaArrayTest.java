import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PilaArrayTest {
    PilaArray<Integer> pila;

    @BeforeEach
    void setUp() {
        pila = new PilaArray<>();
    }

    @Test
    @DisplayName("Pila vacia")
    void pruebaEstaVacia(){
        assertTrue(pila.estaVacia(),"si esta vacia");
        pila.aniadir(4);
        assertFalse(pila.estaVacia());
    }

    @Test
    @DisplayName("Extraer primero")
    void pruebaExtraerPrimero(){
        pila.aniadir(4);
        assertEquals(4, pila.extraer(),"El numero no es el esperado");
        pila.aniadir(5);
        assertNotEquals(4, pila.extraer(), "El numero no es el esperado");
    }

    @Test
    @DisplayName("Extraer no nulo")
    void pruebaExtraerNotNull(){
        pila.aniadir(5);
        assertNotNull(pila.extraer(),"El elemento es nulo");
    }
    @Test
    @DisplayName("Mostrar primero")
    void pruebaMostrarPrimero(){
        pila.aniadir(4);
        assertEquals(4, pila.extraer(),"El numero no es el esperado");
        pila.aniadir(5);
        assertNotEquals(4, pila.extraer(), "El numero no es el esperado");
    }

    @Test
    @DisplayName("Añade elemento")
    void pruebaAniadir(){
        assertTrue(pila.aniadir(4), "El numero ha sido introducido correctamente");

    }
}
