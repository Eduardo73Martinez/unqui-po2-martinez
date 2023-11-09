
public class Tienda {
	private final ServicioNotificacion servicio;

	public Tienda() {
		servicio = new ServicioNotificacion(); 
		//constructor
	}

	public void nuevaPromocion() {
		this.getServicioDeNotificacion().notificar();

	}

	public ServicioNotificacion getServicioDeNotificacion() {
		return servicio;
	}

}
