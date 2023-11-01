package ar.edu.unq.po2.tp7;

public class CuentaCorriente extends CuentaBancaria {
	/**
	 * clase concreta
	 */
	private int descubierto;

	public CuentaCorriente(String titular, int descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	public int getDescubierto() {
		return descubierto;
	}

	/**
	 * se define la condicion a extraer para esta clase concreta
	 */

	@Override
	boolean condicionAExtraer(int monto) {
		// TODO Auto-generated method stub
		return this.getSaldo() + this.getDescubierto() >= monto;
	}

}
