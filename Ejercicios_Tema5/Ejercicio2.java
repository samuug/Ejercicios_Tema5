package Ejercicios_Tema5;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir=false;
        int cont0 = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        int cont6 = 0;
        int cont7 = 0;
        int cont8 = 0;
        int cont9 = 0;
        do {
            System.out.println("Introduce un número entre 0 y 9(-1 para terminar): ");
            numero = sc.nextInt();
            switch (numero){
                case 0:
                    cont0++;
                    break;
                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
                case 6:
                    cont6++;
                    break;
                case 7:
                    cont7++;
                    break;
                case 8:
                    cont8++;
                    break;
                case 9:
                    cont9++;
                    break;
                case -1:
                    salir = true;
                    break;
            }
        }while (!salir);
        System.out.println("El número 0 se ha introducido "+cont0+" veces");
        System.out.println("El número 1 se ha introducido "+cont1+" veces");
        System.out.println("El número 2 se ha introducido "+cont2+" veces");
        System.out.println("El número 3 se ha introducido "+cont3+" veces");
        System.out.println("El número 4 se ha introducido "+cont4+" veces");
        System.out.println("El número 5 se ha introducido "+cont5+" veces");
        System.out.println("El número 6 se ha introducido "+cont6+" veces");
        System.out.println("El número 7 se ha introducido "+cont7+" veces");
        System.out.println("El número 8 se ha introducido "+cont8+" veces");
        System.out.println("El número 9 se ha introducido "+cont9+" veces");
    }
}
