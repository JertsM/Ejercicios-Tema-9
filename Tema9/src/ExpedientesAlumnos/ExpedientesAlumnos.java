package ExpedientesAlumnos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

/**
Programa que almacene y gestione los Nº de expediente y alumnos de la clase.
- Utiliza un HashMap para almacenar los datos de tus compañeros de clase.
a. Indica cuantos alumnos hay.
b. Pide un Nº de expediente, si existe muestra el nombre del alumno, sino indica el error.
c. Permite eliminar un alumno de nuestra lista.
 */

public class ExpedientesAlumnos {

    static HashMap<Integer, String> listadoExpedientesAlumnos = new HashMap<>();

    public static void introducirAlumnos(){
        listadoExpedientesAlumnos.put(1, "Mauricio");
        listadoExpedientesAlumnos.put(3, "María");
        listadoExpedientesAlumnos.put(6, "Pablo");
        listadoExpedientesAlumnos.put(34, "Laura");
        listadoExpedientesAlumnos.put(108, "Marcos");

        System.out.println("El número de expedientes es de " + listadoExpedientesAlumnos.size());
    }

    public static void solicitarExpediente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el expediente a buscar: ");
        int codigoBuscar = sc.nextInt();

        if(listadoExpedientesAlumnos.containsKey(codigoBuscar)){
            System.out.println(listadoExpedientesAlumnos.get(codigoBuscar));
        }else{
            System.out.println("ERROR: El expediente introducido no existe.");
        }
    }

   public static void eliminarAlumno(){
       Iterator claves = listadoExpedientesAlumnos.keySet().iterator();
   }

    public static void main(String[] args) {
        introducirAlumnos();
        solicitarExpediente();
        eliminarAlumno();
    }
}
