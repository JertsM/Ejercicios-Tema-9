package Ejercicio2;

public class Principal {
    public static void main(String[] args) {
        Bebida [] inventario = new Bebida[5];
        inventario[0] = new AguaMineral(1,"agua sousas","Gadis Teis",1.20,"botella de cristal","Sousas");
        inventario[1] = new AguaMineral(2,"Aguarón","Froiz Plaza E",0.75,"botella de plástico","aguarón");
        inventario[2] = new AguaMineral(3,"Agua mondariz","Mercadona Aragón",1.10,"botella de cristal","Mondariz");
        inventario[3] = new Refresco();
        inventario[4] = new Refresco(4,"Kas Naranja","Lidl Teis",1.00,"lata",7.0);

        calculoMedias(inventario);
    }
    public static void calculoMedias(Bebida[] array){
        double sumaRefrescos = 0, sumaAguas = 0;
        double contAgua = 0, contRefrescos = 0;

        for(int i=0;i<5;i++){

            array[i].calcularPrecio();

            if (array[i] instanceof Refresco){
                sumaRefrescos += array[i].getPrecio();
                contRefrescos++;
            }

            if (array[i] instanceof AguaMineral){
                sumaAguas += array[i].getPrecio();
                contAgua++;
            }

            System.out.println("El precio de " + array[i].getNombre() + " es: " + array[i].getPrecio() + " €");
        }
        System.out.println("La media de precio de los refrescos es " + sumaRefrescos/contRefrescos + " €");
        System.out.println("La media de precio del agua mineral es " + sumaAguas/contAgua + " €");
    }
}
