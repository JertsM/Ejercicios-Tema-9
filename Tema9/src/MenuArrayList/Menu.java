package MenuArrayList;

import java.util.*;

public class Menu {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        ArrayList<Integer> arrayMenu = new ArrayList<Integer>();

        boolean salir = false;
        int opcion;

        while(!salir){
            System.out.println("Introduzca 1 para añadir un número");
            System.out.println("Introduzca 2 para buscar un número");
            System.out.println("Introduzca 3 para eliminar un número");
            System.out.println("Introduzca 4 para modificar un número dado");
            System.out.println("Introduzca 5 para salir");
            System.out.println("\r");
            System.out.println("Escribe una de las opciones: ");
            opcion = sn.nextInt();

            switch(opcion){
                case 1:
                    arrayMenu.add(opcion);
                case 2:

                case 3:
                    arrayMenu.remove(opcion);
                case 4:
                    arrayMenu.add(n, opcion);
                case 5:
                    salir = true;
                    break;
            }
        }
    }
}
