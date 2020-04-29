package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    private List <Temporada> temporadas = new ArrayList<>();
    // Recorrer cada temporada
    // Si el nro de temporada del ciclo es igual a "numero"
    // Devolver esa temporada
    private Clasificacion clasificacion;

    public Clasificacion getClasificacion (){
        return this.clasificacion;
    }
    public void setClasificacion (Clasificacion clasificacion){
        this.clasificacion = clasificacion;
    }

    public Temporada getTemporada(int numero){
        
        for (Temporada tempo : this.temporadas){
           if (tempo.getNumero() == numero) {
            return tempo;
        }
    }

        return null;
    }

}

