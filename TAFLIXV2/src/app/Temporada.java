package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private int numero;
    private List<Episodio>episodios = new ArrayList<>();
    private List<Websodio>websodios = new ArrayList<>();

    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
    public List<Episodio> getEpisodios(){
        return this.episodios;
    }
    public void setEpisodios(List<Episodio> episodios){
        this.episodios = episodios;
    }
    public List<Websodio> getWebsodios(){
        return this.websodios;
    }
    public void setWebsodios(List<Websodio> websodios){
        this.websodios = websodios;
    }

    public Episodio getEpisodio(int numero){
            
    //Recorrer cada episodio
    //Si el nro de episodio del ciclo es igual a "nro"
    //Devolver ese episodio

    for (Episodio epi: this.episodios){
        if (epi.getNumero() == numero){
            return epi;
        }
    }
    return null;
    }

public Websodio getWebsodio(int numero){

    for (Websodio epi : this.websodios){
        if (epi.getNumero() == numero){
            return epi;
        }
    }

    return null;
}
/**
 * Obtiene un episodio en base a la posicion dentro del ArrayList
  @param pos
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
