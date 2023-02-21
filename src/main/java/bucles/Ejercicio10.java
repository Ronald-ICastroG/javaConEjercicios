package bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        /*Escribe un programa que calcule la media de un conjunto de números positivos
        introducidos por teclado. A priori, el programa no sabe cuántos números se
        introducirán. El usuario indicará que ha terminado de introducir los datos
        cuando meta un número negativo.*/
        Scanner input=new Scanner(System.in);
        ArrayList<Integer>num =new ArrayList<>();
        int n=1;
        int contador=0;
        double suma=0;

        while(n>=0){
            n=input.nextInt();
            if(n>=0) {
                suma+=n;
                num.add(n);
                contador++;

            }
        }
        System.out.println("numeros ingresados: "+num);
        System.out.println("la media de los números ingresados es: "+(suma/num.size()));
        System.out.println("la media de los números ingresados es: "+(suma/contador));


    }

}
