package MetodosArrays;

import java.util.ArrayList;

public class MethodsArrays {
    ArrayList<String> listaArray;

    public void cargarArray(){
    }

    public void mostrarArray(){
        if(!listaArray.isEmpty()){
            for(int i=0; i<listaArray.size(); i++){
                int indice = listaArray.indexOf(i);
                System.out.println(listaArray.get(i));
                if(indice != -1){
                    System.out.println("El nombre de " + i + " está en el índice " + indice);
                }else{
                    System.out.println("Caracteres introducidos no válidos.");
                }
            }

        }
    }

    public static void main(String[] args) {
        MethodsArrays ejemplo = new MethodsArrays();
        ejemplo.listaArray = new ArrayList();
        ejemplo.cargarArray();
        ejemplo.mostrarArray();

    }
}
