package Hospital;

import java.text.SimpleDateFormat;
import static Hospital.Area.especialidadMedica;
import java.util.Scanner;

public class Pacientes extends Persona{

    SimpleDateFormat fechaPaciente = new SimpleDateFormat();

    private String patologiaActual;

    public Pacientes(String DNI, String nombre, int edad, String direccion, String patologiaActual) {
        super(DNI, nombre, edad, direccion);
        this.patologiaActual = patologiaActual;
    }

    public String getPatologiaActual() {
        return patologiaActual;
    }

    public void setPatologiaActual(String patologiaActual) {
        this.patologiaActual = patologiaActual;
    }

    public Pacientes(String DNI, String nombre, int edad, String direccion) {
        super(DNI, nombre, edad, direccion);
        this.patologiaActual = "";
    }

    @Override
    public void costeAnho() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el número de días de estadía del paciente: ");
        int diasEstadia = sc.nextInt();

        System.out.println("Declare las áreas en las que ha sido ingresado ");


        int costeTotal = diasEstadia * 700;

        if(especialidadMedica == "traumatologia"){
            float costeTotalPlus = (float) (costeTotal * 1.02);
        }
    }
}
