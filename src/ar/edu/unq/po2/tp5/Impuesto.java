package ar.edu.unq.po2.tp5;

public class Impuesto extends Servicio {

	public Impuesto(double precioUnidad, int cantidadConsumida) {
		super(precioUnidad, cantidadConsumida);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double registrarPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase() - this.descuento();
	}

	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return this.precioBase() * 0.21;
	}

}
