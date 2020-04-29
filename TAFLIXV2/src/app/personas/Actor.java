package app.persona;

import java.util.List;

import app.INominable;

public class Actor extends Persona implements INominable {

	public Actor(String nombre) {
		this.nombre = nombre;
	}

	private String nombre;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public boolean ganoPreviamente() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reproducirTrailerNominacion() {
		// TODO Auto-generated method stub

	}

	@Override
	public void SacarSelfie(List<Actor> elenco) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean estaNominado() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void SacarSelfie(List<app.Actor> elenco) {
		// TODO Auto-generated method stub

	}

	@Override
	public void SacarSelfie(List<app.Actor> elenco) {
		// TODO Auto-generated method stub

	}
}