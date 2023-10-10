package ar.edu.unq.po2.tp6.BancosYclientes;

public class CreditoPersonal extends Solicitud {

	public CreditoPersonal(double montoSolicitado, int plazoMeses, Cliente solicitante) {
		super(montoSolicitado, plazoMeses, solicitante);
		// TODO Auto-generated constructor stub
	}

	@Override
	boolean solicitudAprobada() {
		// TODO Auto-generated method stub
		return condicionSueldo() && condicionCuotas();
	}

	private boolean condicionCuotas() {
		return this.montoDeLasCuotas() <= this.getSolicitante().getSueldoNeto() * 0.70;
	}
	
	private boolean condicionSueldo() {
		return this.getSolicitante().sueldoNetoAnual()>15000;
	}

}
