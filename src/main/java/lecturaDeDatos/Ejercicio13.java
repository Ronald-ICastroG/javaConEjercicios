package lecturaDeDatos;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {


    /*Realiza un programa que calcule la nota que hace fslt sacar
    en el segundo examen de la asignatura Programación para obtener la media deseada.
    Hay que tener en cuenta que la nota del primer exámen cuenta el 40% y la del segundo exámen
    un 60%
     */

    Scanner s=new Scanner(System.in);

        System.out.println("Ingrese la nota del primer examen: \n");


        double nota1=s.nextDouble();

        System.out.println("¿Qué nota deseas sacar  en la asignatura? ");

        double nFinal=s.nextDouble();


        double nota2=(nFinal-(0.4)*nota1)/(0.6);
        System.out.println("Para sacar una nota de :"+nFinal+" necesitas sacar una nota de :"+nota2);
        double cFinal=(0.4*nota1)+(0.6*nota2);
        System.out.println("nota final : "+cFinal);
    }
    }