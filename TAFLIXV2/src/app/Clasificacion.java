package app;

public class Clasificacion {

public Clasificacion (String tipo, int edadMin, String descripcion){
    super();
    this.tipo = tipo;
    this.edadMin = edadMin;
    this.descripcion = descripcion;

}

    private String tipo;
    private int edadMin;
    private String descripcion;

public String getTipo(){
    return this.tipo;
}
public void setTipo(String tipo){
    this.tipo = tipo;
}
public int getEdadMin(){
    return this.edadMin;
}
public void setEdadMin(int edadMin){
    this.edadMin = edadMin;
}
public String getDescripcion(){
    return this.descripcion;
}
public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
}
}