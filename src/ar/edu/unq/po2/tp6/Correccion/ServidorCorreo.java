package ar.edu.unq.po2.tp6.Correccion;

import java.util.List;

public interface ServidorCorreo {
	public void enviar(Correo correo);

	public List<Correo> recibir();

}
