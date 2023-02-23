package Ejercicios_Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Ejercicio10 {
    public String nombre;
    public int nEmpleado;
    public int nSS;

    public Ejercicio10(String nombre, int nEmpleado, int nSS) {
        this.nombre = nombre;
        this.nEmpleado = nEmpleado;
        this.nSS = nSS;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnEmpleado() {
        return nEmpleado;
    }

    public void setnEmpleado(int nEmpleado) {
        this.nEmpleado = nEmpleado;
    }

    public int getnSS() {
        return nSS;
    }

    public void setnSS(int nSS) {
        this.nSS = nSS;
    }

    @Override
    public String toString() {
        return "[Nombre: "+getNombre()+", Numero_Empleado: "+getnEmpleado()+", Numero_SeguridadSocial: "+getnSS()+']';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet <Ejercicio10> empleados = new HashSet<>();
        empleados.add(new Ejercicio10("Juan", 1, 123456789));
        empleados.add(new Ejercicio10("Pedro", 2, 987654321));
        empleados.add(new Ejercicio10("Luis", 3, 123456789));
        boolean salir=false;
        int opcion;
        do {
            System.out.println("1.- Buscar empleado por nombre");
            System.out.println("2.- Buscar empleado por número de empleado");
            System.out.println("3.- Buscar empleado por número de la seguridad social");
            System.out.println("4.- Mostrar todos los empleados");
            System.out.println("5.- Salir");
            opcion = sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Introduce el nombre del empleado: ");
                    String nombre = sc.next();
                    for (Ejercicio10 empleado:empleados) {
                        if (empleado.getNombre().equals(nombre)){
                            System.out.println(empleado.toString());
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce el número de empleado: ");
                    int nEmpleado = sc.nextInt();
                    for (Ejercicio10 empleado:empleados) {
                        if (empleado.getnEmpleado() == nEmpleado){
                            System.out.println(empleado.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("Introduce el número de la seguridad social: ");
                    int nSS = sc.nextInt();
                    for (Ejercicio10 empleado:empleados) {
                        if (empleado.getnSS() == nSS){
                            System.out.println(empleado.toString());
                        }
                    }
                    break;
                case 4:
                    for (Ejercicio10 empleado:empleados) {
                        System.out.println(empleado.toString());
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    salir = true;
                    break;
            }
        }while (!salir);

    }
}
