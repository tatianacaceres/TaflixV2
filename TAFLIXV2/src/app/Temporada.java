package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public int numero;
    public List<Episodio>episodios = new ArrayList<>();

public Temporada getEpisodio(int nro){
    //Recorrer cada episodio
    //Si el nro de episodio del ciclo es igual a "nro"
    //Devolver ese episodio

    for (Episodio epi: this.episodios){
        if (epi.numero == nro){
            return epi;
        }
    }
    return null;

}

public Websodio getWebsodio(int nro){

    for (Websodio epi : this.websodios){
        if (epi.numero == nro){
            return epi;
        }
    }

    return null;
}
/**
 * Obtiene un episodio en base a la posicion dentro del ArrayList
 * @param pos
 * @return
 */
public Episodio getEpisodioAtPosicion(int pos){
    return this.episodios.get(pos);
}
public List<Websodio> obtenerWebsodios() {
    List<Websodio> lista = new ArrayList<>();
    for (Episodio epi : this.episodios) {
        if (epi instanceof Websodio)
            lista.add((Websodio) epi);
    }
    return lista;
}

}