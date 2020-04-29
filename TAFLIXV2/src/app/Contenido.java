package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

public abstract class Contenido {

    private String nombre;
    private Genero genero;
    private int año;
    private String descripcion;
    private int calificacion;
    public List<Actor>elenco = new ArrayList<>();

    public void reproducir(){
    }

    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public Genero getGenero(){
        return this.genero = genero;
    }
    public void setGenero(Genero genero){
        this.genero = genero;
    }
    public String getDescripcion (){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public int getCalificacion(){
        return this.calificacion;
    }
    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }
    public int getAño(){
        return this.año;
    }
    public void setAño(int año){
        this.año = año;
    }

}