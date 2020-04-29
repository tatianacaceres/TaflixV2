package app.persona;

public abstract class Persona {

    private String nombre;
    private String edad;

public String getNombre(){
    return this.nombre;
}
public void setNombre(String nombre){
    this.nombre = nombre;
}
public String getEdad(){
    return this.edad;
}
public void setEdad(String edad){
    this.edad = edad;
}
}