package DatosAlumnos;

import java.util.Comparator;

public class DatosAlumnos {

    public void ordenarAlumnos(){
        Comparator<Alumno> ComparadorAlumnos =
                Comparator.comparing(Alumno::getApellido1).thenComparing(Alumno::getApellido2).thenComparing(Alumno::getNombre);
    }
}
