package ar.edu.unq.po2.tp5;

public class Cliente {
	private double billetera;

	public Cliente(double billetera) {
		super();
		this.billetera = billetera;
	}

	public void pagar(double cantidad) {
		if (this.billetera < cantidad) {
			throw new Error("No tiene la cantidad suficiente para pagar");
		} else {
			billetera -= cantidad;
		}
	}

	public double getBilletera() {
		return billetera;
	}

}
