package bucles;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        /*
        Realiza el control de acceso a una caja fuerte. La combinación será un
número de 4 cifras. El programa nos pedirá la combinación para abrirla. Si no
acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación”
y si acertamos se nos dirá “La caja fuerte se ha abierto satisfactoriamente”.
Tendremos cuatro oportunidades para abrir la caja fuerte.
         */


  String pass="0763";
    int i=4;
    String contra;
    Scanner s=new Scanner(System.in);
    do{
        System.out.println("Tienes "+i+" intentos");
        System.out.println("Ingrese el número: ");

        contra=s.nextLine();
        i--;
        if(contra.equals(pass)){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
            break;
        }else{
            System.out.println("Error ");
        }

    }while(i>0||contra.equals(pass));
        System.out.println("Programa finalizado, hasta luego ...");

    }
}
