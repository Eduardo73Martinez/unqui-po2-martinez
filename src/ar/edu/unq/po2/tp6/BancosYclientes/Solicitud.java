package ar.edu.unq.po2.tp6.BancosYclientes;

public abstract class Solicitud {
	private double montoSolicitado;
	private int plazoMeses;
	private Cliente solicitante;

	public Solicitud(double montoSolicitado, int plazoMeses, Cliente solicitante) {
		super();
		this.montoSolicitado = montoSolicitado;
		this.plazoMeses = plazoMeses;
		this.solicitante = solicitante;
	}

	public double montoDeLasCuotas() {
		return this.montoSolicitado / this.plazoMeses;
	}

	abstract boolean solicitudAprobada();

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getPlazoMeses() {
		return plazoMeses;
	}

	public Cliente getSolicitante() {
		return solicitante;
	}
	
	

}
