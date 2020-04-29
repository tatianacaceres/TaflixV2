package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

public class Episodio {

public Episodio (int numero, String nombre, int duracionEnMinutos){
    
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.duracionEnMinutos = duracionEnMinutos;

}

    private int numero;
    private String nombre;
    private int duracionEnMinutos;
    private String descripcion;
    private List <Actor>elenco = new ArrayList<>();
    private int año;
    
//Getter y Setter = Getter: devuelve el valor de un atributo. Setter: le pone el valor al atributo

//Getter
public int getNumero(){
    return this.numero;
}
//sETTER
public void setNumero(int numero){
    this.numero = numero;
}

public String getNombre(){
    return this.nombre;
}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public int getDuracionEnMinutos(){
    return this.duracionEnMinutos;
}

public void setDuracionEnMinutos(int duracionEnMinutos){
    this.duracionEnMinutos = duracionEnMinutos;
}

public String getDescripcion(){
    return this.descripcion;
}

public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
}

public int getAño(){
    return this.año;
}

public void setAño(int año){
    this.año = año;
}

public List<Actor> getElenco(){
    return this.elenco;
}

public void setElenco(List<Actor>elenco){
    this.elenco = elenco;
}

public void reproducir(){
System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
}
}