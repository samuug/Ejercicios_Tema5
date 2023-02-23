package Ejercicios_Tema5;

import org.junit.platform.commons.util.StringUtils;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una palabra y después #");
        String palabra = sc.nextLine();
        palabra = palabra.substring(0, palabra.length() - 1);
        //palabra = palabra.replace("#", "");
        String palabraInvertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraInvertida += palabra.charAt(i);
        }
        if (palabra.equals(palabraInvertida)) {
            System.out.println("La palabra " + palabra + " es un palíndromo");
        } else {
            System.out.println("La palabra " + palabra + " no es un palíndromo");
        }
    }
}
