package Ejercicios_Tema5;

import java.util.Scanner;


public class Ejercicio9 {

    public static void limpiarTablero(char[][] matriz, char caracter) {
        for (int filas = 0; filas < 3; ++filas) {
            for (int columnas = 0; columnas < 3; ++columnas) {
                matriz[filas][columnas] = caracter;
            }
        }
    }

    public static void imprimirTablero(char[][] matriz) {
        for (int filas = 0; filas < 3; ++filas) {
            for (int columnas = 0; columnas < 3; ++columnas) {
                System.out.print(matriz[filas][columnas]+" ");
            }
            System.out.println();
        }
    }
    public static boolean ponerFicha(char matriz[][], int f, int c, char caracter){
        if (matriz[f][c]=='_'){
            matriz[f][c]=caracter;
            return true;
        }
        System.out.println("Casilla ocupada");
        return false;
    }

    public static boolean ganador (char matriz[][], int f, int c, char caracter) {
        int contador = 0;
        //filas
        for (int i = 0; i < 3; ++i) {
            if (matriz[i][c]==caracter){
                contador++;
                if (contador==3){
                    System.out.println("Ganador "+caracter);
                    return true;
                }
            }
        }
        contador = 0;
        //columnas
        for (int i = 0; i < 3; ++i) {
            if (matriz[f][i]==caracter){
                contador++;
                if (contador==3){
                    System.out.println("Ganador "+caracter);
                    return true;
                }
            }
        }
        contador = 0;
        //d1
        if (!(f==0 && c==1) || !(f==1 && c==0) || !(f==1 && c==2) || !(f==2 && c==1)){
            for (int i = 0; i < 3; ++i) {
                if (matriz[i][i]==caracter){
                    contador++;
                    if (contador==3){
                        System.out.println("Ganador "+caracter);
                        return true;
                    }
                }
            }
        }
        contador = 0;
        //d2
        if (!(f==0 && c==1) || !(f==1 && c==0) || !(f==1 && c==2) || !(f==2 && c==1)){
            for (int i = 2; i >= 0; --i) {
                if (matriz[i][i]==caracter){
                    contador++;
                    if (contador==3){
                        System.out.println("Ganador "+caracter);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] matriz =new char[3][3];
        final char VACIA = '_';
        final char CRUZ = 'X';
        final char CIRCULO = 'O';
        int f, c;
        int turno = 0;
        limpiarTablero(matriz, VACIA);
        do {
            imprimirTablero(matriz);
            System.out.println("Jugador " + (turno%2==0?CIRCULO:CRUZ));
            System.out.println("Introduce columna: ");
            c = sc.nextInt();
            System.out.println("Introduce fila: ");
            f = sc.nextInt();
            if (turno%2==0){
                if(ponerFicha(matriz, f, c, CIRCULO)){
                    turno++;
                }
            } else {
                if(ponerFicha(matriz, f, c, CRUZ)){
                    turno++;
                }
            }
        }while (!ganador(matriz, f, c, (turno-1)%2==0?CIRCULO:CRUZ));
    }
}
