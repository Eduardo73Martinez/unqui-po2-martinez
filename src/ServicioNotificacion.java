import java.util.ArrayList;
import java.util.List;

public class ServicioNotificacion {
	private final List<Email> clientes;

	public ServicioNotificacion() {
		this.clientes = new ArrayList<>();
	}
	
	public void suscribirse(Email e) {
		clientes.add(e);
	}
	
	public void desuscribirse(Email e) {
		clientes.remove(e);
	}
	
	public void notificar() {
		clientes.forEach(s->s.actualizar());
	}
	
	
}
