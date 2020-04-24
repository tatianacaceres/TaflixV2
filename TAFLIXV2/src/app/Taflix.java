package app;

import java.util.ArrayList;
import java.util.List;

public class Taflix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();
	

    public Serie buscarSerie(String titulo) {
        for (Serie s: this.series){
            if (s.nombre.equals(titulo))
            return s;
        }

        return null;
    }
	public void inicializarCatalogo() {
        this.inicializarLasChicasDelCable();
        
        }
    
    public void inicializarLasChicasDelCable(){
    
    Serie serie1 = new Serie ();
    serie1.nombre = "Las chicas del cable";
    this.series.add(serie1);
    
    Actor actor1 = new Actor();
    actor1.nombre = "Blanca Suarez";

    Actor actor2 = new Actor();
    actor2.nombre = "Yon Gonzalez";

    serie1.elenco.add(actor1);
    serie1.elenco.add(actor2);

    Clasificacion clasificacion = new Clasificacion();
    clasificacion.tipo = "TV MA";
    clasificacion.edadMin = 17;
    clasificacion.descripcion = "Contenido inadecuado para audencias menores de 17 años";

    serie1.clasificacion = clasificacion;

    Genero genero = new Genero ();
    genero.descripcion = "Drama";
    serie1.genero = genero;
    
    // Serie 1 Temporadas Las chicas del cable
    Temporada t1 = new Temporada();
    t1.numero = 1;
    serie1.temporadas.add(t1);

    //Serie 1 Episodios Las chicas del cable TEMPORADA 
    Episodio epi = new Episodio(1, "Los sueños",54);
   
   // epi = new Episodio();
    //epi.nombre = "Los sueños";
    //epi.numero = 1;
    //epi.duracionEnMinutos = 54;
    
    t1.episodios.add(epi);
   epi = new Episodio(2, "Los recuerdos", 50);   
   // epi = new Episodio();
    //epi.nombre = "Los recuerdos";
    //epi.numero = 2;
    //epi.duracionEnMinutos = 50;
    
    t1.episodios.add(epi);

    Temporada t2 = new Temporada ();
    serie1.temporadas.add(t2);
    t2.numero = 2;

    epi = new Episodio(1, "La eleccion", 50);
    //epi.nombre = "La eleccion";
    //epi.numero = 1;
    //epi.duracionEnMinutos = 50;
    t2.episodios.add(epi);

    epi = new Episodio(2, "El pacto", 46);
    //epi.nombre = "El pacto";
    //epi.numero = 2;
    //epi.duracionEnMinutos = 46;
    t2.episodios.add(epi);

    //WEBSODIO
    Websodio webi = new Websodio(20, "Episodio web","http://direccion.com", 30);

    //webi.numero = 20;
    //webi.nombre = "Episodio web";
    //webi.duracionEnMinutos = 30;
    //webi.url = "http://direccion.com"

    t2.episodios.add(webi);
}
}

