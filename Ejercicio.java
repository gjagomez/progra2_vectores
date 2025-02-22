/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Javier Gomez Riz
 */
public class Ejercicio {

      public static int[] minOperations(String boxes) {
        //Declaramos la variable boxes que esta en la intruccion de la tarea COMO ENTRADA
        int n = boxes.length();
        //Declaramos la variable donde almacenamos la respuesta que representa el numero de la operacion
        int[] answer = new int[n];
        //Usamos un bucle for para recorrer la variable n 
        for (int i = 0; i < n; i++) {
            int operations = 0;
          
            for (int j = 0; j < n; j++) {
                if (boxes.charAt(j) == '1') {
                    operations += Math.abs(i - j);
                }
            }
            answer[i] = operations;
        }
        return answer;
    }
      
    public static void main(String[] args) throws IOException, InterruptedException {
        String boxes1 = "110";
        System.out.println(Arrays.toString(minOperations(boxes1))); 
        
        String boxes2 = "001011";
        System.out.println(Arrays.toString(minOperations(boxes2)));
    }
}
