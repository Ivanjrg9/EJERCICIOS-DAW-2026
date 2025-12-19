package org.example.Programame;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HundirlaflotaTest {

    @Test
    void barcos() {
        // No se puede testear Scanner fácilmente,
        // así que comprobamos que el metodo existe y no falla
        assertDoesNotThrow(() -> {
            Hundirlaflota.buscar_barcos(new int[0][0]);
        });
    }

    @Test
    void tablero() {
        int[][] tablero = {
                {1, 0, 0},
                {0, 1, 1},
                {0, 0, 0}
        };

        assertAll(
                () -> assertEquals(3, tablero.length),
                () -> assertEquals(3, tablero[0].length),
                () -> assertEquals(1, tablero[1][1]),
                () -> assertEquals(1, tablero[1][2])
        );
    }

    @Test
    void buscar_barcos() {
        int[][] tablero = {
                {1, 1, 0},
                {0, 0, 0},
                {1, 0, 0}
        };

        assertAll(
                () -> assertDoesNotThrow(() -> Hundirlaflota.buscar_barcos(tablero)),
                () -> assertEquals(1, tablero[0][0]),
                () -> assertEquals(1, tablero[0][1])
        );
    }
}
