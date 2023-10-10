package ar.edu.unq.po2.tp6.BancosYclientes;

import java.util.ArrayList;

public class Banco {

	private ArrayList<Cliente> clientes = new ArrayList<>();
	private ArrayList<Solicitud> solicitudes = new ArrayList<>();

	public void agregarSolicitud(Cliente c, Solicitud s) {
		this.solicitudes.add(s);
		this.agregarCliente(c);
	}

	public void agregarCliente(Cliente c) {
		if (!clientes.contains(c)) {
			this.clientes.add(c);
		}
	}

}
