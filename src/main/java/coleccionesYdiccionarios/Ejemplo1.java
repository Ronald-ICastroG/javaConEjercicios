package coleccionesYdiccionarios;

import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<String> a=new ArrayList<String>();
        System.out.println("N° de elementos: "+a.size());

        a.add("rojo");
        a.add("verde");
        a.add("azul");


        System.out.println("N° de elementos: "+a.size());
       a.add("blanco");
        System.out.println("N° de elementos: "+a.size());

        System.out.println("El elemento que se encuentra en la posición 0 es: "+a.get(0));
        System.out.println("El elemento que se encuentra en la posición 3 es: "+a.get(2));


    }
}
