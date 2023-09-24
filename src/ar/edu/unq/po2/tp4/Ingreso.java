package ar.edu.unq.po2.tp4;

import java.util.Date;

public class Ingreso {
	private Date fecha;
	private String concepto;
	protected double monto;
	protected double imponible = 0.21;

	public double getImpuesto() {
		return monto * this.imponible;
	}

	public Ingreso(Date fecha, String concepto, double monto) {
		super();
		this.fecha = fecha;
		this.concepto = concepto;
		this.monto = monto;
	}

	public double getMonto() {
		return monto - this.getImpuesto();
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
