package com.ffs.Tema1_IntroduccionProgramacion.Ej2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Ej2MainTest {

    @Test
    void main() {
        assertEquals(2, 2);
        assertAll("Prueba Multiple",
                () -> assertTrue(true),
                () -> assertFalse(false));
    }
}