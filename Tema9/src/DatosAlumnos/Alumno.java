package DatosAlumnos;

public class Alumno {

    private String apellido1;
    private String apellido2;
    private String nombre;
    private String nacionalidad;

    public Alumno(String apellido1, String apellido2, String nombre, String nacionalidad) {
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "El alumno " + apellido1 + " " + apellido2 + " " + nombre + ", de nacionalidad " + nacionalidad;
    }
}
