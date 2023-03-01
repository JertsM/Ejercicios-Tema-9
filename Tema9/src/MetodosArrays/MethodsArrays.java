package MetodosArrays;

import java.util.ArrayList;

public class MethodsArrays {
    ArrayList<String> listaArray;

    public void cargarArray(){
        listaArray.add("Pablo");
        listaArray.add("María");
        listaArray.add("Manuel");
        listaArray.add("Lucía");
        listaArray.add("Mauricio");
        listaArray.add("Sofía");
    }

    public void mostrarArray(){
        if(!listaArray.isEmpty()){
            for(int i=0; i<listaArray.size(); i++){
                System.out.println(listaArray.get(i));
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
