package ar.edu.unq.po2.tp4;

import java.util.Date;

public class HorasExtra extends Ingreso {

	private int cantidadRealizadas;

	public HorasExtra(Date fecha, String concepto, double monto, int cantidadHorasExtra) {
		super(fecha, concepto, monto);
		// TODO Auto-generated constructor stub
		this.cantidadRealizadas = cantidadHorasExtra;
	}
	
	@Override
	public double getImpuesto() {
		return 0;
	}

}
