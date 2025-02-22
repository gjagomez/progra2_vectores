/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ROG STRIX
 */
public class Ejercicio3 {
     public static List<List<Integer>> findMatrix(int[] nums) {
        // Lista de listas para almacenar el resultado 
        List<List<Integer>> result = new ArrayList<>();
        
        // Mapa para rastrear en qué fila se encuentra cada número
        Map<Integer, Integer> numToRow = new HashMap<>();

        // Iterar sobre cada número en nums
        for (int num : nums) {
            // Obtener la fila actual donde aparece este número
            int row = numToRow.getOrDefault(num, 0);

            // Si no hay suficientes filas en el resultado, agregar una nueva fila
            if (result.size() <= row) {
                result.add(new ArrayList<>());
            }

            // Agregar el número a la fila correspondiente
            result.get(row).add(num);

            // Actualizar el mapa para indicar que este número ahora está en la siguiente fila
            numToRow.put(num, row + 1);
        }

        return result;
    }

    public static void main(String[] args) {
       
        int[] nums1 = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(nums1));
       
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(findMatrix(nums2));
    }
}
