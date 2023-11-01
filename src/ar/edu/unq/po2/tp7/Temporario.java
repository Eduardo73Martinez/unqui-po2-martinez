package ar.edu.unq.po2.tp7;

public class Temporario extends Empleado {
	private double precioxHora;
	private double cantTrabajado;
	private boolean cazado;
	private boolean hijos;
	
	
	

	public Temporario(String nombre, double sueldoBasico, double precioxHora, double cantTrabajado, boolean cazado,
			boolean hijos) {
		super(nombre, sueldoBasico);
		this.precioxHora = precioxHora;
		this.cantTrabajado = cantTrabajado;
		this.cazado = cazado;
		this.hijos = hijos;
	}

	@Override
	double descuento() {
		// TODO Auto-generated method stub
		return this.getSueldoBasico()* 0.13;
	}

	@Override
	double extra() {
		// TODO Auto-generated method stub
		return this.extraPorFamilia();
	}
	
	private double extraPorFamilia() {
		if (this.cazado || this.hijos) {
			return 100;
		}
		else {
			return 0;
		}
	}
	
	
}
