package CodigosPostales;

import MenuArrayList.Menu;
import com.sun.security.jgss.GSSUtil;

import java.util.*;

/*
Almacena en un HashMap los códigos postales de las provincias de Galicia.
a. Muestra por pantalla los datos introducidos.
b. Pide un código postal y muestra la provincia asociada si existe sino avisa al usuario.
c. Elimina las provincias de Lugo y Pontevedra.
d. Muestra por pantalla los datos.

 */

public class CodigosPostales {

    static HashMap<Integer, String> codigosPostales = new HashMap<>();

    public static void Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;

        opcion = sc.nextInt();

        do{

            System.out.println("Inserte 1 para mostrar los datos introducidos por pantalla");
            System.out.println("Inserte 2 para solicitar el C.P");
            System.out.println("Inserte 3 para eliminar las provincias de Lugo y Pontevedra");
            System.out.println("Inserte 4 para mostrar los datos por pantalla");
            System.out.println("Introduzca 5 para salir\n");

            System.out.println("\r");

            System.out.println("Escriba una de las opciones (1-5): ");
            opcion = sc.nextInt();

            switch (opcion){
                case 1 -> crearDatos();
                case 2 -> solicitarCP();
                case 3 -> eliminarProvincias();
                case 4 -> mostrarDatosPorPantalla();
            }

        } while (opcion != 5);
    }

    public static void crearDatos(){

        codigosPostales.put(36, "Pontevedra");
        codigosPostales.put(27, "Lugo");
        codigosPostales.put(32, "Ourense");
        codigosPostales.put(15, "A Coruña");
    }

    public static void solicitarCP(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el código a buscar");
        int codigoBuscar = sc.nextInt();

        if(codigosPostales.containsKey(codigoBuscar)){
            System.out.println(codigosPostales.get(codigoBuscar));
        }else{
            System.out.println();
        }
    }

    public static void eliminarProvincias(){
        codigosPostales.remove(27);
        codigosPostales.remove(36);
    }

    public static void mostrarDatosPorPantalla(){}

    public static void main(String[] args) {
        CodigosPostales.Menu();
    }
}
