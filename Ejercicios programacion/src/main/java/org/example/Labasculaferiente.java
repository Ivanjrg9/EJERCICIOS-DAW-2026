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
                                                //PEDIMOS LA ALTURA
               System.out.println(" INTRODUCE TU ALTURA EN CENTIMETROS PORFAVOR ");
               altura = teclado.nextInt();      //LA INTRODUCIMOS

               System.out.println("LEYENDO ALTURA (CM)... ");
               System.out.println(" MIDES: " + altura + "cm");

               repetir_a= false;
                            //SI INTRODUCE UN FORMATO ERRONEO EL PROGRAMA DARA ERROR
           }catch (Exception error){
               System.out.println( " ERROR: EL FORMATO INTRODUCIDO NO ES EL CORRECTO... ");
               repetir_a = true;
           }
                //SE REPETIRA EN CASO DE QUE EL BOOLEANO SEA TRUE
       }while (repetir_a == true);
                    //SI ESTO NO SE CUMPLE EL PROGRAMA IMPRIMIRA LO SIGUIENTE Y HARA EL CALCULO DE CUANTO LE FALTA PARA LLEGAR
       if (altura > altura_maxima || altura < altura_minima){
           System.out.println(" LO SIENTO, NO LLEGAS A LA ALTURA PERMITIDA POR " + (altura - altura_maxima) + " CM ");
       }else{

           do {
               try {            //PEDIMOS EL PESO
                   System.out.println( " INTRODUCE TU PESO EN (KG) ");
                   peso = teclado.nextInt();
                   repetir_p = false;
                                    //EN EL CASO DE QUE NOS INTRODUZCA UN FORMATO INCORRECTO VOLVERA A DAR ERROR
               }catch (Exception error){
                   System.out.println( " EL FORMATO INTRODUCIDO NO ES CORRECTO ");
                   repetir_p = true;
               }

           }while (repetir_p == true);
                            //SI EXCEDE EL PESO MAXIMO EL PROGRAMA IMPRIMIRA LO SIGUENTE
           if (peso > peso_maximo){
               System.out.println( " LO SIENTO EXCEDES EL PESO PERMITIDO POR " + (peso - peso_maximo) + " KG ");
           }else {
                            //SI NO SE CUMPLE TAMPOCO PODRA CONTINUAR
               if (peso < altura * 2 / 8) {
                   System.out.println(" LO SIENTO PESAS DEMASIADO POCO PARA TU ALTURA");
               } else {

               }            //SI TODO LO ANTERIOR ESTA CORRECTO EL PROGRAMA TE DEJARA CONTINUAR ADELANTE 
                   System.out.println( " ENHORABUENA, PUEDES SUBIR!! ADELANTE!!");
           }
       }






































           }



}
