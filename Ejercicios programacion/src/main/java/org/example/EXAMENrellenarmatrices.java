package org.example;

import java.util.Arrays;

public class EXAMENrellenarmatrices {
    static void main() {
       //crea matriz
       // int[][] m = new int[filas][columnas];

        //rellenar matriz
       // for(int i=0;i<filas;i++){
          //  for(int j=0;j<columnas;j++){
             //   m[i][j] = valor;
           // }
        //}

        //rellenar desde teclado
      //  m[i][j] = sc.nextInt();

        //rellenar usando split (string ==> matriz)
       // String[] v = linea.split("-");
       // m[fila][col] = v[col];

        //imprimir matriz
      //  Arrays.toString(m[i]);
       // for (int filas[]:m){
           // System.out.println(Arrays.toString(filas));
       // }

       // int[][] m = new int[filas][columnas];
        //String[][] texto = new String[3][3];


        //buscar un valor
     //   boolean encontrado = false;
       // int buscado = 10;

       // for(int i = 0; i < mat.length; i++){
           // for(int j = 0; j < mat[i].length; j++){
               // if(mat[i][j] == buscado){
                    //encontrado = true;
               // }
           // }
       // }
        //bucar el numero mayor
       // int max = mat[0][0];
       // for(int i = 0; i < mat.length; i++){
            //for(int j = 0; j < mat[i].length; j++){
                //if(mat[i][j] > max){
                   // max = mat[i][j];
               // }
          //  }
        //}

        int[] vec = {1,2,3,4,5};
        int[][] mat = new int[3][3];
        int sumaTotal = 0;

// Rellenar matriz y sumar
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j] = vec[j] + i;
                sumaTotal += mat[i][j];
            }
        }

// Imprimir matriz
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Suma total: "+sumaTotal);










    }
}
