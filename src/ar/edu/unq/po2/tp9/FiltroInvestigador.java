package ar.edu.unq.po2.tp9;

import java.util.List;

public class FiltroInvestigador implements Investigador {
	private List<String> titulosDeInteres;
	private List<String> autoresDeInteres;
	private List<String> ubicacionDeInteres;
	private List<String> tipoArticulo;

	private Suscriptor suscriptor;
	// IMPORTANTE notifica solo a un suscriptor
	// si algun tema del articulo dado esta en la lista de intereses

	public FiltroInvestigador(List<String> titulosDeInteres, List<String> autoresDeInteres,
			List<String> ubicacionDeInteres, List<String> tipoArticulo, Suscriptor suscriptor) {
		super();
		this.titulosDeInteres = titulosDeInteres;
		this.autoresDeInteres = autoresDeInteres;
		this.ubicacionDeInteres = ubicacionDeInteres;
		this.tipoArticulo = tipoArticulo;
		this.suscriptor = suscriptor;
	}

	public boolean enListaDeInteres(Articulo a) {
		return this.autoresDeInteres.contains(a.getAutores()) || this.titulosDeInteres.contains(a.getTitulo())
				|| this.ubicacionDeInteres.contains(a.getUbicacion())
				|| this.tipoArticulo.contains(a.getTipoArticulo());
	}

	@Override
	public void notificacion(SistemaBibliografico s, Articulo a) {
		// TODO Auto-generated method stub
		if (this.enListaDeInteres(a)) {
			this.suscriptor.notificacion(s, a);
		}
	}

}
