package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public List <Temporada> temporadas = new ArrayList<>();
    // Recorrer cada temporada
    // Si el nro de temporada del ciclo es igual a "numero"
    // Devolver esa temporada
	public Clasificacion clasificacion;

    public Temporada getTemporada(int nro){
        
        for (Temporada tempo : this.temporadas){
           if (tempo.numero == nro) {
            return tempo;
        }
    }

        return null;
    }

}

