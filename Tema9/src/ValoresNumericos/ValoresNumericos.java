package ValoresNumericos;

import java.util.*;

public class ValoresNumericos {

    static ArrayList<Integer> arrayEnteros = new ArrayList<>();

    public void insertarValores(){
        Scanner sc = new Scanner(System.in);
        int numeros = 0;

        while(numeros != -99){
            System.out.println("Introduzca un número (-99 para salir): ");
            numeros = sc.nextInt();
            if(numeros != -99){
                arrayEnteros.add(numeros);
            }
        }
    }

    public double operarNumeros(){
        int suma = 0;
        int contadorNumeros = 0;
        double media = 0;

        for(int i = 0; i < arrayEnteros.size(); i++){

            suma += arrayEnteros.get(i);
            contadorNumeros++;
        }

        media = suma/contadorNumeros;

        System.out.println("Número de valores introducidos: " + contadorNumeros);
        System.out.println("La suma de los valores introducidos es: " + suma);
        System.out.println("La media de los valores introducidos es: " + media);
        return media;
    }

    public void mayoresQueLaMedia(double media){

        int contadorMedia = 0;

        for(int i = 0; i < arrayEnteros.size(); i++){
            if(arrayEnteros.get(i) > media){
                contadorMedia++;
            }
        }
        System.out.println("Hay " + contadorMedia + " números mayores que la media.");
    }

    public static void main(String[] args) {
        ValoresNumericos listaDeNums = new ValoresNumericos();
        listaDeNums.insertarValores();
        double media = listaDeNums.operarNumeros();
        listaDeNums.mayoresQueLaMedia(media);
    }
}
