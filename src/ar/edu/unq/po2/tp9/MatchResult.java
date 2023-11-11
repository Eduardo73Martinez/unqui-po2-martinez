package ar.edu.unq.po2.tp9;

import java.util.ArrayList;

public class MatchResult {
	private ArrayList<Servidor> suscriptores;
	
	public void agregarSuscripcion(Servidor s) {
		this.suscriptores.add(s);
	}
	
	public void cancelarSuscripsion(Servidor s) {
		this.suscriptores.remove(s);
	}
	
	public void notificar() {
		this.suscriptores.forEach(s->s.update(null));
		
	}
	
	public void suscribirseA(ArrayList<String> resultados, 
			ArrayList<String> contrincantes, 
			ArrayList<String> deportes,
			ServidorDigital servidor) {
		this.agregarSuscripcion(new FiltroApp(resultados, contrincantes, deportes, servidor));
	}

}
