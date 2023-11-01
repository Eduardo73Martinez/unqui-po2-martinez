package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.ArrayList;

public abstract class CuentaBancaria {
	/**
	 * Es la clase abstracta del template method
	 */
	private String titular;
	private int saldo;
	private List<String> movimientos;

	public CuentaBancaria(String titular) {
		super();
		this.titular = titular;
		this.saldo = 0;
		this.movimientos = new ArrayList<String>();
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public void agregarMovimiento(String movimiento) {
		this.movimientos.add(movimiento);
	}

	public String getTitular() {
		return titular;
	}

	/**
	 * 
	 * @param monto
	 * 
	 *              es el template method define la extructura
	 */

	public void extraer(int monto) {
		if (condicionAExtraer(monto)) {
			this.setSaldo(this.getSaldo() - monto);
			this.agregarMovimiento("Extracción");
			this.hookMethod(); // es el hook method
		}
	}

	/**
	 * 
	 * @param monto es el cantidad que deseamos saber si podemos extraer
	 * @return un booleano
	 */

	abstract boolean condicionAExtraer(int monto);

	/**
	 * el hook method para agregar fucionalidad si se requiere
	 */

	public void hookMethod() {

	}

}
