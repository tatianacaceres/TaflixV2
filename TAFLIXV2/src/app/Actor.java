package app;

public class Actor {
	
	public Actor (String nombre){
		this.nombre = nombre;
	}

	private String nombre;

public String getNombre(){
	return this.nombre;
}

public void setNombre(String nombre){
	this.nombre = nombre;
}
}