package ar.edu.unq.po2.tp7;

public class CajaDeAhorro extends CuentaBancaria {
	/**
	 * clase concreta
	 */
	private int limite;

	public CajaDeAhorro(String titular, int limite) {
		super(titular);
		this.limite = limite;
	}

	public int getLimite() {
		return limite;
	}

	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	/**
	 * se define la condicion a extraer para esta clase concreta
	 */

	@Override
	boolean condicionAExtraer(int monto) {
		// TODO Auto-generated method stub
		return this.getSaldo() >= monto && this.getLimite() >= monto;
	}

}
