package ar.edu.unq.po2.tp6.BancosYclientes;

public class Propiedad {
	private String descripcion;
	private String direccion;
	private double valor;

	public Propiedad(String descripcion, String direccion, double valor) {
		super();
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

}
