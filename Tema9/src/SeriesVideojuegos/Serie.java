package SeriesVideojuegos;

import java.util.ArrayList;

public class Serie implements Entregable{

    ArrayList<String> arraySeries = new ArrayList();

    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;


    private enum genero {terror, comedia, drama, accion}
    private String creador;

    public Serie() {
        this.numeroDeTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador){
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, int numeroDeTemporadas, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.creador = creador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "La serie " + "'" +  titulo + "'" + ", tiene actualmente " + numeroDeTemporadas
                + " temporadas. El estado de la entrega es " + entregado
                + ", y su creador es " + creador;
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
