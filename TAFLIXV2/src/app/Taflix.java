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

    Serie serie1 = new Serie();
    serie1.nombre = "Friends";
    this.series.add(serie1);

    // Serie 1 Temporadas friends
    Temporada serie1T1 = new Temporada();
    serie1T1.numero = 1;
    Temporada serie1T2 = new Temporada();
    serie1T2.numero = 2;

    serie1.temporadas.add(serie1T1);
    serie1.temporadas.add(serie1T2);

    //Serie 1 Episodios FRIENDS TEMPORADA 1
    Episodio serie1T1E1 = new Episodio();
    serie1T1E1.nombre = "The Pilot";
    serie1T1E1.numero = 1;
    serie1T1.episodios.add(serie1T1E1);
    
    Episodio serie1T1E2 = new Episodio();
    serie1T1E2.nombre = "The one with the Sonogram at the end";
    serie1T1E2.numero = 2;
    serie1T1.episodios.add(serie1T1E2);

}

}