package ar.edu.unq.po2.tp9;
import java.util.ArrayList;

public class SistemaBibliografico {
	
	private ArrayList<Investigador> suscriptores = new ArrayList<>();
	private ArrayList<Articulo> bibliografia = new ArrayList<>();

	public void suscribir(Investigador i) {
		this.suscriptores.add(i);
	}

	public void desuscribir(Investigador i) {
		this.suscriptores.remove(i);
	}

	public void agregarArticulo(Articulo a) {
		this.bibliografia.add(a);
		this.notificarSobre(a);
	}

	public void notificarSobre(Articulo a) {
		this.suscriptores.forEach(s->s.notificacion(this, a));
	}

	public ArrayList<Investigador> getSuscriptores() {
		return suscriptores;
	}

	public ArrayList<Articulo> getBibliografia() {
		return bibliografia;
	}
	
	
}
