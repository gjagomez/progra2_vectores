# Ejercicios Progra 3
## _Javier Gomez Riz_



[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)]()



## Ejecucion

Este codigo se puede ejecutar con cualquier version de java

para correr el codigo es necesario de tener instalado Apache Netbeens


## Cogido





```sh
 
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
    //Implementarcion
    public static void main(String[] args) throws IOException, InterruptedException {
        String boxes1 = "110";
        System.out.println(Arrays.toString(minOperations(boxes1))); 
        
        String boxes2 = "001011";
        System.out.println(Arrays.toString(minOperations(boxes2)));
    }
```

```sh
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
```

> Nota: `--Solo dejo evidencia de dos ejercicios` 


## License

MIT

**Javier Gomez**

