package bucles;

public class Ejercicio5 {

    /*
     *Muestre los números del 320 al 160, contando de 20 en 20 hacia atrás usando
     * un ciclo while
     * */

    public static void main(String[] args) {

        int i =320;
        System.out.println("de 20 en 20 desde 320 a 160 con while");
        while(i>=160){
            System.out.println(i);
            i-=20;
        }

    }
}
