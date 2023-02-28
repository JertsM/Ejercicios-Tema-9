package MenuArrayList;

import java.util.*;

public class Menu extends ArrayList<Integer> {

    ArrayList<Integer> listadoDeNumeros;

    public void EstructuraMenu(){

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("\nMenú: Listado de números");
            System.out.println("Introduzca 1 para añadir un número");
            System.out.println("Introduzca 2 para buscar un número");
            System.out.println("Introduzca 3 para eliminar un número");
            System.out.println("Introduzca 4 para modificar un número dado");
            System.out.println("Introduzca 5 para mostrar la lista de valores");
            System.out.println("Introduzca 6 para mostrar el orden ascendente");
            System.out.println("Introduzca 7 para mostrar el orden descendente");
            System.out.println("Introduzca 8 para salir\n");
            System.out.println("\r");
            System.out.println("Escriba una de las opciones (1-5): ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1 -> ingresarValor();
                case 2 -> buscarValor();
                case 3 -> eliminarValor();
                case 4 -> modificarValor();
                case 5 -> mostrarListaDeValores();
                case 6 -> ordenarValoresAscendentes();
                case 7 -> ordenarValoresDescendentes();
            }
        }while(opcion != 8);
    }

    public void ingresarValor(){
        Scanner sc = new Scanner(System.in);
        int valor = 0;
        System.out.println("Introduzca un valor: ");
        valor = sc.nextInt();
        listadoDeNumeros.add(valor);
    }

    public void buscarValor(){
        Scanner sc = new Scanner(System.in);
        int valor, index = 0;
        System.out.println("Introduzca el valor a buscar: ");
        valor = sc.nextInt();
        index = listadoDeNumeros.indexOf(valor);
        if(index != -1){
            System.out.println("El dato se encuentra en la posición " + index);
        }else{
            System.out.println("Lo sentimos, el dato introducido no ha sido encontrado.");
        }
    }

    public void eliminarValor(){
        Scanner sc = new Scanner(System.in);
        int valor, index;
        System.out.println("Introduzca el dato a eliminar: ");
        valor = sc.nextInt();
        index = listadoDeNumeros.indexOf(valor);
        if(index != -1){
            listadoDeNumeros.remove(index);
            System.out.println("El dato ha sido eliminado");
        }else{
            System.out.println("Lo sentimos, el dato no ha sido encontrado.");
        }
    }

    public void modificarValor(){
        Scanner sc = new Scanner(System.in);
        int valor, valorNuevo, index;
        System.out.println("Introduzca el dato a modificar: ");
        valor = sc.nextInt();
        index = listadoDeNumeros.indexOf(valor);
        if(index != -1){
            System.out.println("Introduzca el nuevo dato: ");
            valorNuevo = sc.nextInt();
            listadoDeNumeros.set(index, valorNuevo);
        }else{
            System.out.println("Lo sentimos, el dato no ha podido ser modificado.");
        }
    }

    public void mostrarListaDeValores(){
        if(!listadoDeNumeros.isEmpty()){
            System.out.println("La lista se compone de los siguientes valores: ");
            for (int i = 0; i< listadoDeNumeros.size(); i++){
                System.out.println(listadoDeNumeros.get(i));
            }
        }else{
            System.out.println("No existen valores en la lista.");
        }
    }

    public void ordenarValoresAscendentes(){
        Collections.sort(listadoDeNumeros);
        mostrarListaDeValores();
    }

    public void ordenarValoresDescendentes(){
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(listadoDeNumeros, comparador);
        mostrarListaDeValores();
    }
}
