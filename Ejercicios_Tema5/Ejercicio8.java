package Ejercicios_Tema5;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio8 {
    public static void rellenarTablero(char tablero[][], int TAMAÑO){
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                tablero[i][j] = '?';
            }
        }
    }
    public static void mostrarTablero(char tablero[][], int TAMAÑO){
        for (int i = 0; i < TAMAÑO; i++) {
            for (int j = 0; j < TAMAÑO; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        final int TAMAÑO = 4;
        char tablero[][] = new char[TAMAÑO][TAMAÑO];
        int filaB = r.nextInt(TAMAÑO);
        int columnaB = r.nextInt(TAMAÑO);
        boolean salir = false;
        rellenarTablero(tablero, TAMAÑO);
        do {
            mostrarTablero(tablero, TAMAÑO);
            System.out.println("Introduce una fila: ");
            int fila = sc.nextInt();
            System.out.println("Introduce una columna: ");
            int columna = sc.nextInt();
            if (fila == filaB && columna == columnaB) {
                System.out.println("Tocado y hundido");

                salir = true;
                break;
            } else {
                tablero[fila][columna] = 'X';
            }
        } while (!salir);
        System.out.println("Has ganado, felicidades!!");
    }
}
