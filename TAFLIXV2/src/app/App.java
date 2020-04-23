package app;

import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {


        Taflix miTaflix = new Taflix();
    
            System.out.println("Iniciando Catalogo");
    
            miTaflix.inicializarCatalogo();
    
            Serie lasChicasDelCable = miTaflix.buscarSerie("Las chicas del cable");
    
            Temporada laMejorTemporada = lasChicasDelCable.getTemporada(1);

            Serie freud = miTaflix.buscarSerie("Freud");
    
            Temporada laMejorTemporada = lasChicasDelCable.getTemporada(1);
    
            Episodio elTop;
    
            elTop = laMejorTemporada.getEpisodio(1);
    
            elTop.reproducir();

            // Websodio

            elTop = laMejorTemporada.getEpisodio(20);
    
            elTop.reproducir();



            System.out.println("Empezando otra cosa");
            Episodio epiDemo;

            int posicion = 0;
    
            /// En base a un numero de posicion de episodio, obtenerlo de la lista
            System.out.println("Ingrese la posicion");
    
            posicion = Teclado.nextInt();
    
            epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);
    
            epiDemo.reproducir();
    
      // Primero: preguntar si es un objeto de X tipo, usando el operador "instanceof"
      // Segundo: usando el operador de casteo (es decir, "transformando la referencia")
       if (epiDemo instanceof Websodio){
           Websodio webi = (Websodio)epiDemo;
           webi.enviarAlertaDeQueEstaOnline();
       }
       else {
           System.out.println("No hay que hacer mas nada con un Episodio");
       }

       int lala;
    
       lala = 0;
    }
}