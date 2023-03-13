package Hospital;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Trabajadores extends Persona{

    SimpleDateFormat fechaTrabajador = new SimpleDateFormat();

  private Area areaSanitaria;
  private String cargo;
  private float salario;

    public Trabajadores(String DNI, String nombre, int edad,
                        String direccion, Area areaSanitaria,
                        String cargo, float salario) {
        super(DNI, nombre, edad, direccion);
        this.areaSanitaria = areaSanitaria;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Trabajadores(String DNI, String nombre, int edad, String direccion) {
        super(DNI, nombre, edad, direccion);
    }

    @Override
    public void costeAnho() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el sueldo del trabajador: ");
        float salario = sc.nextFloat();

        float costeTotal = (float) ((salario * 14) * 1.05);

        System.out.println("El coste total supuesto en el año en curso para el trabajador es: " + costeTotal);
    }
}
