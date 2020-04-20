package app;

public class App {
    public static void main(String[] args) throws Exception {

        Taflix miTaflix = new Taflix();
    
            System.out.println("Iniciando Catalogo");
    
            miTaflix.inicializarCatalogo();
    
            Serie bb = miTaflix.buscarSerie("Friends");
    
            Temporada laMejorTemporada = bb.getTemporada(1);
    
            Temporada elTop;
    
            elTop = laMejorTemporada.getEpisodio(1);
    
            elTop.reproducir();
    
       
    }
}