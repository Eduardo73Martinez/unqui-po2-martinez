package ar.edu.unq.po2.tp4;

public class Producto {
	private String nombre;
	protected double precio;
	private boolean esPrecioCuidado = false;

	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	public Producto(String nombre, double precio, boolean esCuidado) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esCuidado;
	}

	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}

	public void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}

	public String getNombre() {
		return nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void aumentarPrecio(double cantidad) {
		this.precio = this.precio + cantidad;
	}

}
