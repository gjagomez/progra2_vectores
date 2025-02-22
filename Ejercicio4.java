/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

/**
 *
 * @author Javier Gomez
 */
public class Ejercicio4 {
        public static int[] ordenarPorFrecuencia(int[] nums) {
        //Contar la frecuencia de cada número
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int[] freq = new int[max + 1]; // Array para contar la frecuencia
        for (int num : nums) {
            freq[num]++;
        }

        //Crear un arreglo para almacenar el resultado final
        int[] result = new int[nums.length];
        int index = 0;
        
        //Reordenar los elementos según la frecuencia
        for (int num : nums) {
            if (freq[num] > 0) {
                int count = freq[num];
                for (int i = 0; i < count; i++) {
                    result[index++] = num;
                }
                freq[num] = 0; // Para no volver a procesarlo
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 3, 1, 6, 3, 4, 4, 6};
        int[] result = ordenarPorFrecuencia(nums);
        
      
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
