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
public class Ejercicio15 {
    public static void main(String[] args) {
        /*Escribe un programa que dados dos números, uno real (base) y un entero
positivo (exponente), saque por pantalla todas las potencias con base el
numero dado y exponentes entre uno y el exponente introducido. No se deben
utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
se deberán mostrar 2^1,2^2,2^3, 2^4 y 2^5.
.*/
        Scanner input=new Scanner(System.in);
        
        System.out.println("Ingrese la base: ");
        int base=input.nextInt();
        System.out.println("Ingrese el exponente ");
        int exponente=input.nextInt();
        
        for (int i = 0; i < exponente; i++) {
            for (int j = 0; j < 10; j++) {
                
            }
            System.out.println(base+"^"+exponente+"="+base*base);
            
        }
    }
}
