package bucles;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        /*Escribe un programa que lea una lista de diez números y determine cuántos
son positivos, y cuántos son negativos.*/
        int positivos=0;
        int negativos=0;
        int n;
        ArrayList numbers=new ArrayList(10);
        Scanner sc=new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            n=sc.nextInt();
            numbers.add(n);
            if(n>0){
                positivos+=1;
            }else if(n<0){
                negativos+=1;
            }else{
                System.out.println("error");
            }

        }
        System.out.println("Positivos: "+positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println(numbers);


    }
}
