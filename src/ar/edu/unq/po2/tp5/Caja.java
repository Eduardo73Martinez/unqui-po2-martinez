package ar.edu.unq.po2.tp5;

import java.util.ArrayList;

public class Caja {
	private ArrayList<IProducto> productosCliente;

	public Caja(ArrayList<IProducto> productosCliente) {
		super();
		this.productosCliente = productosCliente;
	}

	public void registrarCompra(IProducto p) {
		this.productosCliente.add(p);
	}

	public double montoTotalAPagar() {
		double total = 0;
		for (IProducto p : productosCliente) {
			total = total + p.registrarPrecio();
			p.decrementarStock();
		}
		return total;
	}

	public void cobrarACliente(Cliente c) {
		c.pagar(this.montoTotalAPagar());
	}

	public void cobrarAAgencia(IAgencia c) {
		c.registrarPago(new Servicio(0, 0));
	}

}
