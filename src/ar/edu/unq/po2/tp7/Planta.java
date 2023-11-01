package ar.edu.unq.po2.tp7;

public class Planta extends Empleado {
	private int cantHijos;

	public Planta(String nombre, double sueldoBasico, int cantHijos) {
		super(nombre, sueldoBasico);
		this.cantHijos = cantHijos;
	}

	@Override
	double descuento() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico() * 0.13;
	}

	@Override
	double extra() {
		// TODO Auto-generated method stub
		return this.cantHijos * 150;
	}

}
