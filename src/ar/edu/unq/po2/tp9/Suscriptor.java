package ar.edu.unq.po2.tp9;

public class Suscriptor implements Investigador {
	private String nombre;

	public Suscriptor(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public void notificacion(SistemaBibliografico s, Articulo a) {
		// TODO Auto-generated method stub
		if(this.notificacionRecidida(a)) {
			
		}
		
	}
	
	public boolean notificacionRecidida(Articulo a) {
		return true;
	}
	

}
