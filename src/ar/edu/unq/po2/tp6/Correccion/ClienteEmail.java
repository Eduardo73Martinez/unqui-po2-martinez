package ar.edu.unq.po2.tp6.Correccion;

import java.util.ArrayList;

public class ClienteEmail extends Cliente {
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;

	public ClienteEmail(String nombreUsuario, String passUsuario, Servidor servidor) {
		super(nombreUsuario, passUsuario, servidor);
		// TODO Auto-generated constructor stub
	}

	@Override
	void conectar() {
		// TODO Auto-generated method stub
		this.getServidor().conectar(this.getNombreUsuario(), this.getPassUsuario());
	}

	public void borrarCorreo(Correo c) {
		this.inbox.remove(c);
	}

	public int contarBorrados() {
		return this.borrados.size();
	}

	public int contarInbox() {
		return this.inbox.size();
	}

	public void recibirNuevos() {
		this.inbox.addAll(this.getServidor().recibir()); 
		/**
		 * ¿como hago acá? está tipado con Servidor y yo quiero
		 * los mensajes de ServidorPop 
		 */
	}

}
