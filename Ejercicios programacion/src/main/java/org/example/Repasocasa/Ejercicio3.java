package org.example.Repasocasa;

import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce el primer numero:");
        int num1 = teclado.nextInt();

        System.out.println("Introduce el segundo numero:");
        int num2 = teclado.nextInt();

        System.out.println("Introduce el tercer numero:");
        int num3 = teclado.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("El mayor es: " + num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("El mayor es: " + num2);

        }else {
            System.out.println("El mayor es " + num3);
        }

        if (num1<num2 && num1<num3){
            System.out.println("El menor es: " + num1);
        } else if (num2<num1 && num2<num3) {
            System.out.println("El menor es: " + num2);

        }else {
            System.out.println("El menor es: " + num3);
        }

        if (num1==num2 || num2==num3 || num3==num1){
            System.out.println("Hay numeros repetidos.");
        }

        // Calcular mayor segun chatgpt
//        int mayor = num1;
//        if (num2 > mayor) mayor = num2;
//        if (num3 > mayor) mayor = num3;
//
//        // Calcular menor
//        int menor = num1;
//        if (num2 < menor) menor = num2;
//        if (num3 < menor) menor = num3;
//
//        // Mostrar resultados
//        System.out.println("El mayor es: " + mayor);
//        System.out.println("El menor es: " + menor);
    }
}
