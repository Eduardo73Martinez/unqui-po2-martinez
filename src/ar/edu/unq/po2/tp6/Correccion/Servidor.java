package ar.edu.unq.po2.tp6.Correccion;

import java.util.List;

public interface Servidor {
	
	public void conectar(String nombreUsuario, String pass);
	public void enviar(Correo correo);

	public List<Correo> recibir();

}
