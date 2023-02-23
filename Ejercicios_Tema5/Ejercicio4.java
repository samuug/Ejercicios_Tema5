package Ejercicios_Tema5;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        boolean salir=false;
        double emi=0;
        double ger=0;
        double mar=0;
        double nad=0;
        double cont=0;
        do {
            System.out.println("Elija entre: ");
            System.out.println("1.- Emilia TERREROS");
            System.out.println("2.- Gerardo ESCODAR");
            System.out.println("3.- María AGUAVIVA");
            System.out.println("4.- Nadia LETUX");
            numero = sc.nextInt();
            cont++;
            try{
                switch (numero){
                    case 1:
                        emi++;
                        System.out.println("Usted a votado");
                        break;
                    case 2:
                        ger++;
                        System.out.println("Usted a votado");
                        break;
                    case 3:
                        mar++;
                        System.out.println("Usted a votado");
                        break;
                    case 4:
                        nad++;
                        System.out.println("Usted a votado");
                        break;
                    case 68753421:
                        salir = true;
                        cont -= 1;
                        break;
                }
            } catch (Exception e){
                System.out.println("Voto nulo");
            }

        }while (!salir);
        System.out.println("Resultados: ");
        double porEmi = Math.round((emi/cont*100) * 100.0) / 100.0;
        double porGer = Math.round((ger/cont*100) * 100.0) / 100.0;
        double porMar = Math.round((mar/cont*100) * 100.0) / 100.0;
        double porNad = Math.round((nad/cont*100) * 100.0) / 100.0;
        System.out.println("Emilia TERREROS: "+porEmi+" %");
        System.out.println("Gerardo ESCODAR: "+porGer+" %");
        System.out.println("María AGUAVIVA: "+porMar+" %");
        System.out.println("Nadia LETUX: "+porNad+" %");
    }
}
