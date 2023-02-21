package bucles;

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        /*Escribe un programa que pida una base y un exponente (entero positivo) y
        que calcule la potencia.*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el número a elevar: ");

        int base=sc.nextInt();
        System.out.println("Ingrese la potencia a la cual quiere elevar el número: \n ");
        int exponente=sc.nextInt();
        int contador=0;
        int potencia=1;
        do{
            potencia*=base;
            contador++;
        } while(contador<exponente);


        System.out.println(base+"^"+exponente+" = "+potencia);
    }
}

