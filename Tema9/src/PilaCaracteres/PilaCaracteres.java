package PilaCaracteres;

import java.util.*;

public class PilaCaracteres {

    static Stack<Character> st;

    public static void introducirCaracteres(){

        Scanner caracterEjer = new Scanner(System.in);
        char caracter;

        System.out.println("Introduzca caracteres (pulse enter para salir): ");
        caracter = caracterEjer.next().charAt(0);



        if(caracter == 0){
            System.out.println("Se ha finalizado la introducción de caracteres.");
        }else {
            st.add(caracter);
        }
    }

    public static void mostrarCaracteres(){
        if(!st.isEmpty()){
            System.out.println("Los caracteres que se han introducido son los siguientes: ");
            for (int i = 0; i< st.size(); i++){
                System.out.println(st.get(i));
            }
        }else{

        }


    }


}
