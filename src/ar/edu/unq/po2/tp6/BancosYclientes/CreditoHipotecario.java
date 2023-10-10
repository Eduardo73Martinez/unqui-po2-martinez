package ar.edu.unq.po2.tp6.BancosYclientes;

public class CreditoHipotecario extends Solicitud {
	private Propiedad garantia;

	public CreditoHipotecario(double montoSolicitado, int plazoMeses, Cliente solicitante, Propiedad garantia) {
		super(montoSolicitado, plazoMeses, solicitante);
		this.garantia = garantia;
	}

	@Override
	boolean solicitudAprobada() {
		// TODO Auto-generated method stub
		return this.condicionCuotas() && this.condicionGarantia() && this.condicionEdad();
	}

	public boolean condicionCuotas() {
		return this.montoDeLasCuotas() <= this.getSolicitante().getSueldoNeto() * 0.50;
	}

	public boolean condicionGarantia() {
		return this.getMontoSolicitado() <= this.getGarantia().getValor() * 0.70;
	}

	public Propiedad getGarantia() {
		return garantia;
	}

	public boolean condicionEdad() {
		return this.getSolicitante().getEdad() + this.calculoAñosDelasCuotas(this.getPlazoMeses()) <65.0;
	}

	public int calculoAñosDelasCuotas(int cantidadMeses) {
		return cantidadMeses/12;
	}

}
