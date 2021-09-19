package com.ffs.Tema1_IntroduccionProgramacion.Ej1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Hola Test")
    void hola() {
        assertEquals(2, 2);
        assertAll("Prueba Multiple",
                () -> assertTrue(true),
                () -> assertFalse(false));
    }
}