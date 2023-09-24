package ar.edu.unq.po2.tp5;

public class Servicio implements Factura {
	protected double precioUnidad;
	protected int cantidadConsumida;

	public Servicio(double precioUnidad, int cantidadConsumida) {
		super();
		this.precioUnidad = precioUnidad;
		this.cantidadConsumida = cantidadConsumida;
	}

	@Override
	public double registrarPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase() - this.descuento();
	}

	@Override
	public void decrementarStock() {
		// TODO Auto-generated method stub

	}

	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return this.precioUnidad * this.cantidadConsumida;
	}

}
