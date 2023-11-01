package ar.edu.unq.po2.tp7;

public abstract class Empleado {
	private String nombre;
	private double sueldoBasico;

	public Empleado(String nombre, double sueldoBasico) {
		super();
		this.nombre = nombre;
		this.sueldoBasico = sueldoBasico;
	}

	public double sueldo() {
		return this.sueldoBasico + this.extra() - this.descuento();
	}

	abstract double descuento();

	abstract double extra();

	public double getSueldoBasico() {
		return sueldoBasico;
	}
	
	
}
