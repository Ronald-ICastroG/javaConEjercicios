package bucles;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        /*Escribe un programa que muestre los n primeros términos de la serie de
        Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1
        y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
        los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
        debe introducir por teclado.*/

        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números de fibonacci que desea \n");
        int terminos=sc.nextInt();
        ArrayList nFibo=new ArrayList<>();
        nFibo.add(0);
        nFibo.add(1);
        int serie;

        System.out.println(nFibo);
        for (int i = 1;i <=(terminos) ; i++){
            serie=((int)nFibo.get(i))+((int)nFibo.get(i-1));
            nFibo.add(serie);
            System.out.println(nFibo);
        }



    }
}
