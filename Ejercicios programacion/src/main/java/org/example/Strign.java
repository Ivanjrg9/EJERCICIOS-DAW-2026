package org.example;

public class Strign {
    static void main(String[] args){
        String frase = " Juan le regala una paloma de oro a trump";

        int tamaño = frase.length();
        System.out.println(tamaño);

        System.out.println(frase.charAt(28));

        String trozo = frase.substring(33,41);
        System.out.println(trozo);

        String trozo2 = frase.substring(41);
        System.out.println(trozo2);

       int posicion_oro = frase.indexOf("oro", 13);
        System.out.println(posicion_oro);

        int posicion_oro_ultima = frase.lastIndexOf("oro");
        System.out.println(posicion_oro_ultima);

        String fras_mayuscula = frase.toUpperCase();
        System.out.println(fras_mayuscula);
        String frase_minuscula =frase.toLowerCase();
        System.out.println(frase_minuscula);


        String nombre = "Iván            ";
        System.out.println(nombre.trim() + " - " + nombre + "#");
        String nombre_mayus = nombre.toUpperCase();
        boolean iguales = nombre_mayus.trim().equals( "IVÁN");
        System.out.println(iguales);

        boolean iguales2 = nombre.trim().equalsIgnoreCase("IVÁN");
        System.out.println(iguales2);


        String cambiada = frase.replace("paloma", "palOma");
        System.out.println(cambiada);

        String frase_concat = frase.concat(" de EEUU");
        System.out.println(frase + " de EEUU ");








    }
}
