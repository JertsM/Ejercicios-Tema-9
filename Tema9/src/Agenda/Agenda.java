package Agenda;

import javax.swing.*;
import java.util.*;

import static Agenda.Contacto.nombre;
import static Agenda.Contacto.numero;

public class Agenda {
    /*
    Contacto c;

    public void Menu(){
        Scanner sc = new Scanner(System.in);
        int opcion;


        do{
            System.out.println("\nMenú: Listado de contactos");
            System.out.println("Teclee 1 para añadir un contacto");
            System.out.println("Teclee 2 para buscar un contacto");
            System.out.println("Teclee 3 para eliminar un contacto");
            System.out.println("Teclee 4 para modificar un contacto");
            System.out.println("Teclee 5 para mostrar la lista de contactos");
            System.out.println("Teclee 6 para revisar si la agenda está llena");
            System.out.println("Teclee 7 para revisar que haya huecos libres en la agenda");
            System.out.println("Teclee 8 para salir\n");
            System.out.println("\r");
            System.out.println("Escriba una de las opciones (1-7): ");
            opcion = sc.nextInt();



            switch (opcion) {
                case 1 -> anhadirContacto(Contacto c);
                case 2 -> existeContacto(Agenda c);
                case 3 -> listarContactos();
                case 4 -> buscaContacto(Agenda c);
                case 5 -> eliminarContacto(Contacto c);
                case 6 -> agendaLlena();
                case 7 -> huecosLibres();
            }
        }while(opcion != 8);
    }

    ArrayList<Contacto> listadoTelefonico;

    public void anhadirContacto(Contacto c){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del contacto: ");
        nombre = sc.nextLine();

        if (nombre.equals(listadoTelefonico)) {
            System.out.println("El nombre introducido ya está registrado.");
        }else{
            listadoTelefonico.add(c);
        }

        System.out.println("Introduzca el número del contacto: ");
        numero = sc.nextInt();

    }

    public void existeContacto(Contacto c){

    }

    public void listarContactos(){
        if(!listadoTelefonico.isEmpty()){
            System.out.println("Lista entera de contactos: ");
            for(int i = 0; i <= listadoTelefonico.size(); i++) {
                System.out.println(listadoTelefonico.get(i));
            }
            }else{
            System.out.println("La agenda de contactos está vacía.");
        }
    }

    public void buscaContacto(String nombre){
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.println("Introduzca el valor a buscar: ");
        index = listadoTelefonico.indexOf(nombre);
        if(nombre.equals(listadoTelefonico)){
            System.out.println("El contacto se encuentra en la posición " + index);
        }else{
            System.out.println("Lo sentimos, el contacto introducido no ha sido encontrado.");
        }
    }

    public void eliminarContacto(Agenda c){
        Scanner sc = new Scanner(System.in);
        int index;
        System.out.println("Introduzca el contacto a eliminar: ");
        index = listadoTelefonico.indexOf(nombre);
        if(c.equals(listadoTelefonico)){
            listadoTelefonico.remove(index);
            System.out.println("El contacto ha sido eliminado");
        }else{
            System.out.println("Lo sentimos, el contacto no ha sido encontrado.");
        }
    }

    public void agendaLlena(){

    }

    public void huecosLibres(){

    }


     */
}