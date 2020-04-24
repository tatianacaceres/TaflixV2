package app;

public class Episodio {

public Episodio (int numero, String nombre, int duracionEnMinutos){
    
    super();
    this.numero = numero;
    this.nombre = nombre;
    this.duracionEnMinutos = duracionEnMinutos;

}

    public int numero;
    public String nombre;
    public int duracionEnMinutos;
    public String descripcion;
    

public void reproducir(){
System.out.println("Reproduciendo episodio " + this.numero + " " + this.nombre);
}
}