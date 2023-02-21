package bucles;

import java.util.Scanner;

public class Ejercicio11 {
    /*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
    los 5 primeros números enteros a partir de uno que se introduce por teclado.*/


    public static void main(String[] args) {


    Scanner input=new Scanner(System.in);
        System.out.println("Ingrese el número: \n");
    int n= input.nextInt();
        System.out.println("El número ingresado es: "+n);
        System.out.println("n \t\t  cuadrado \t\tcubo");

    for(int i=0;i<5;i++){
        System.out.println((n+i)+"\t\t\t"+(n+i)*(n+i)+"\t\t\t"+(n+i)*(n+i)*(n+i));
    }

}}
