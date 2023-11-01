package ar.edu.unq.po2.tp7;

public class Pasante extends Empleado {
	private double precioxHora;
	private double cantTrabajado;
	
	public Pasante(String nombre, double sueldoBasico, double precioxHora, double cantTrabajado) {
		super(nombre, sueldoBasico);
		this.precioxHora = precioxHora;
		this.cantTrabajado = cantTrabajado;
	}

	@Override
	double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	double extra() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
