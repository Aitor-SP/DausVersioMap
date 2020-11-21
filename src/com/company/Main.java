package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Map<Integer,Integer> frecuencia = new HashMap<>();
        int d1,d2, numTirades;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Cuantas veces vas a tirar: ");
        numTirades = input.nextInt();

        // Lanzamiento de los dados
        for (int i = 0; i < numTirades; i++) {
            d1 = random.nextInt(6)+1;
            d2 = random.nextInt(6)+1;
            // Añadir tirada al MAP con el metodo put(clau, valor)
            if (frecuencia.containsKey(d1+d2)) frecuencia.put(d1+d2,frecuencia.get(d1+d2)+1);
            else frecuencia.put(d1+d2,1);
        }
        for (Map.Entry<Integer,Integer> entry : frecuencia.entrySet()) {
            System.out.println(entry.getKey() + " --> " + entry.getValue());
        }
    }
}
