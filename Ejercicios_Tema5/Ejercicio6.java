package Ejercicios_Tema5;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int contador = 1;
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = contador;
                contador++;
            }
        }
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                matriz2[i][j] = i+j;
                contador++;
            }
        }
        System.out.println("La tabla del enunciado es una tabla de 3x3 que contiene los números del 1 al 9");
        System.out.println("");
        System.out.println("Matriz 1:");
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("");
        System.out.println("Matriz 2:");
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
