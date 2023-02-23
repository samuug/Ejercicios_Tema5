package Ejercicios_Tema5;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int i = 10; i >= 0; i--) {
            numeros.add(i);
        }
        System.out.println(numeros);
    }
}
