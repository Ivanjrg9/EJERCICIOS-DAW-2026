package org.example;

import java.util.Arrays;

public class cosas_split {
    static void main() {

        String cadena= "MADRID, barsa, valencia, , manchester";

        String equipos[]= cadena.split(",");
        System.out.println(Arrays.toString(equipos));
    }
}
