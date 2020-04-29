package app;

import java.util.List;

import app.personas.*;

public class Pelicula extends Contenido implements INominable {

    public Pelicula(Director director, int duracionEnMinutos) {
        this.director = director;
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private Director director;
    private int duracionEnMinutos;

    public Director getDirector() {
        return this.director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        // TODO Auto-generated method stub
        System.out.println("Reproduciendo trailer de pelicula" + this.getNombre());
    }

    @Override
    public void SacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominado() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void SacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }
}
