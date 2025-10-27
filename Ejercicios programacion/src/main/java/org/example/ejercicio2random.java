package org.example;

import java.util.Random;
import java.util.Scanner;

public class ejercicio2random {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio =new Random();
        String caracteres ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        System.out.println("Generador de contraseñas... ");
        String contrasenia = "";

        for (int i = 0; i < (aleatorio.nextInt(12)+8); i++) {
            if (contrasenia.length()==12){
                break;
            }
            String mayus = caracteres.substring(0,27);
            String minus = caracteres.substring(26,53);
            String numeros = caracteres.substring(52,caracteres.length()-1);

            contrasenia += mayus.charAt(aleatorio.nextInt(mayus.length()-1));
            contrasenia += minus.charAt(aleatorio.nextInt(minus.length()-1));
            contrasenia += numeros.charAt(aleatorio.nextInt(numeros.length()-1));









        }

        System.out.println(contrasenia);

    }
}
