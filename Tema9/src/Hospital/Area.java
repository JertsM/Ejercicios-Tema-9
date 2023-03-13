package Hospital;

public class Area {

    private static String ID;
    public static String especialidadMedica;

    public Area(String ID, String especialidadMedica) {
        this.ID = ID;
        this.especialidadMedica = especialidadMedica;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEspecialidadMedica() {
        return especialidadMedica;
    }

    public void setEspecialidadMedica(String especialidadMedica) {
        this.especialidadMedica = especialidadMedica;
    }
}
