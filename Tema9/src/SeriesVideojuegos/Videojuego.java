package SeriesVideojuegos;

import java.util.ArrayList;

public class Videojuego implements Entregable{

    ArrayList<String> arrayVideojuegos = new ArrayList();

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;



    private enum genero {carreras, acción, deportes, lucha}
    private String companhia;

    public Videojuego() {
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas){
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
    }

    public Videojuego(String titulo, int horasEstimadas, String companhia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.companhia = companhia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    @Override
    public String toString() {
        return "El videojuego " + titulo + ", tiene aproximadamente " + horasEstimadas +
                " horas de juego. El estado de la entrega es " + entregado + ", por la compañía "
                + companhia;
    }


    @Override
    public boolean entregar() {return true;}

    @Override
    public boolean devolver() {return false;}

    @Override
    public boolean isEntregado() {
        return entregado;
    }
}
