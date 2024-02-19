/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author R_CASTRO
 */
public class Ejercicio17 {
    /*Realiza un programa que sume los 100 números siguientes a un número entero
y positivo introducido por teclado. Se debe comprobar que el dato introducido
es correcto (que es un número positivo).*/
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");

        int variable=sc.nextInt();
        int suma=variable;
        for (int i = 1; i <100 ; i++) {
            if (variable >= 0) {

               suma+=(variable+i);
                System.out.println(i+": "+suma);
            }else{
                System.out.println("error");
                break;
            }

        }
        System.out.println("total "+suma);


    }
    
}
