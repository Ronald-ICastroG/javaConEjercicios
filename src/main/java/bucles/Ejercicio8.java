package bucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Ingrese la tabla de multiplicar que quiere ver: ");

        int tabla=s.nextInt();

        System.out.println("\t\ttabla del "+tabla);
        System.out.println("-------------------------");
        for (int i = 1; i < 11; i++) {
            System.out.println("\t\t"+ tabla +" x "+ i+" = "+tabla*i);
        }
        System.out.println("--------------------------------\n");
    }
}
