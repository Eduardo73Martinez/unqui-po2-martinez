package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	private String nombre;
	private ArrayList<Ingreso> percibidos = new ArrayList<>();

	public Trabajador(String nombre, ArrayList<Ingreso> percibidos) {
		super();
		this.nombre = nombre;
		this.percibidos = percibidos;
	}

	public double getTotalPercibido() {
		double total = 0;
		for (Ingreso s : percibidos) {
			total = total + s.getMonto();
		}
		return total;
	}

	public double getMontoImponible() {
		double impuestotal = 0;
		for (Ingreso s : percibidos) {
			impuestotal = impuestotal + s.getImpuesto();
		}
		return impuestotal;
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.2;
	}
}
