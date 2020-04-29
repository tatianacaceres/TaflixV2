package app;

import java.util.List;

import app.personas.Actor;

public interface INominable {

    boolean ganoPreviamente();

    void reproducirTrailerNominacion();

    void SacarSelfie(List<Actor> elenco);

    boolean estaNominado();

}