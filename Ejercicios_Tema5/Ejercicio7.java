package Ejercicios_Tema5;

import java.util.Random;

public class Ejercicio7 {
    public static void main(String[] args) {
        final int FILAS = 20;
        final int COLUMNAS = 30;
        Random r = new Random();
        char tabla[][] = new char[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tabla[i][j] = (char) (r.nextInt(26) + 'a');
            }
        }
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
