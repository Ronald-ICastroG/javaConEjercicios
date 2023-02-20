package bucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        /* Realiza un programa que nos diga cuántos dígitos tiene un número introducido
por teclado.*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número cualquiera: ");
        int num=sc.nextInt();
        int digitos=0;
        int n1=num;
        while (n1>=1){
        n1=n1/10;
        digitos++;
        }
        System.out.println("el número "+ num+" tiene "+digitos+" digitos");




    }
}
