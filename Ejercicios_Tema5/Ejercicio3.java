package Ejercicios_Tema5;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        ArrayList<Integer> notas = new ArrayList<>();
        do {
            System.out.println("Introduce una nota(-1 para terminar): ");
            nota = sc.nextInt();
            if (nota != -1) {
                notas.add(nota);
            }
        } while (nota != -1);
        double media = 0;
        for (int i = 0; i < notas.size(); i++) {
            media += notas.get(i);
        }
        media /= notas.size();
        System.out.println("La media de las notas "+notas+" es: " + media);
    }
}
