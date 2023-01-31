package bucles;

public class Ejercicio6 {

    public static void main(String[] args) {
        /*
         *Muestre los números del 320 al 160, contando de 20 en 20 hacia atrás usando
         * un ciclo do-while
         * */

        int i=320;
        System.out.println("de 20 en 20, desde 320 a 160 con do-while \n");
        do{
            System.out.println(i);
            i-=20;
        }while(i>=160);
    }
}
