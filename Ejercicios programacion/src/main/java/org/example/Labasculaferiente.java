package org.example;

import java.util.Scanner;

public class Labasculaferiente {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        final int altura_minima = 140;
        final double peso_maximo = 120;
        final int altura_maxima = 230;
        int altura = 0;
        int peso = 0;
        boolean repetir_a = false;
        boolean repetir_p = false;

        System.out.println(" BIENVENIDO AL RATÓN JUGUETÓN ");

       do {
           try {

               System.out.println("Introduce tu altura en centímetros porfavor ");
               altura = teclado.nextInt();

               System.out.println("LEYENDO ALTURA (CM)... ");
               System.out.println(" MIDES: " + altura + "cm");

               repetir_a= false;

           }catch (Exception error){
               System.out.println( " ERROR: EL FORMATO INTRODUCIDO NO ES EL CORRECTO... ");
               repetir_a = true;
           }

       }while (repetir_a == true);

       if (altura > altura_maxima) {
           System.out.println(" LO SIENTO, NO LLEGAS A LA ALTURA PERMITIDA POR " + (altura - altura_maxima) + " CM ");

       }else{
           do {
               try {
                   System.out.println( " INTRODUCE TU PESO EN (KG) ");
                   peso = teclado.nextInt();
                   repetir_p = false;

               }catch (Exception error){
                   System.out.println( " EL FORMATO INTRODUCIDONO ES CORRECTO ");
                   repetir_p = 

               }
           }
           }
       }

        double peso = teclado.nextDouble();
        double peso_minimo = (altura *2) / 8;

        if (peso < peso_minimo || peso > peso_maximo){
            System.out.println( " LO SIENTO... PESAS " + (peso - peso_maximo) + " (KG) MÁS DEL LIMITE DE LA ATRACCION " );
        }else{
            System.out.println(" TU PESO ES: " + peso + " KG ");
            System.out.println(" ADELANTE GRANDULLÓN!!");













































        }
}
