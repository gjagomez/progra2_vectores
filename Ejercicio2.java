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
 * @author Javier Gomez Riz
 */
public class Ejercicio2 {
     public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        // Mapa para almacenar grupos temporales basados en su tamaño
        Map<Integer, List<Integer>> tempGroups = new HashMap<>();
        // Lista final para almacenar los grupos completos
        List<List<Integer>> result = new ArrayList<>();

        // Iterar sobre cada persona y su tamaño de grupo correspondiente
        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i]; // Tamaño del grupo al que pertenece la persona i

            // Si no existe un grupo temporal para este tamaño, créalo
            tempGroups.putIfAbsent(size, new ArrayList<>());

            // Agregar la persona actual al grupo temporal correspondiente
            tempGroups.get(size).add(i);

            // Si el grupo temporal alcanza el tamaño requerido, agregarlo al resultado y limpiarlo
            if (tempGroups.get(size).size() == size) {
                result.add(new ArrayList<>(tempGroups.get(size))); // Agregar una copia del grupo
                tempGroups.get(size).clear(); // Limpiar el grupo temporal
            }
        }

        return result;
    }
    
     public static void main(String[] args) {
       
        int[] groupSizes1 = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(groupSizes1)); 


        int[] groupSizes2 = {2, 1, 3, 3, 3, 2};
        System.out.println(groupThePeople(groupSizes2)); 
    }
     
}
