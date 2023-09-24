package ar.edu.unq.po2.tp5;

public class Producto implements IProducto {
	private double precio;
	protected int cantidad;

	public Producto(double precio, int cantidad) {
		super();
		this.precio = precio;
		this.cantidad = cantidad;
	}

	@Override
	public double registrarPrecio() {
		// TODO Auto-generated method stub
		return this.precioBase() - this.descuento();
	}

	@Override
	public void decrementarStock() {
		// TODO Auto-generated method stub
		this.validarStock();
		this.cantidad--;
	}

	public void validarStock() {
		if (this.cantidad <= 0) {
			throw new Error("No hay stock disponible");
		}
	}

	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double precioBase() {
		// TODO Auto-generated method stub
		return precio;
	}

	public double getPrecio() {
		return precio;
	}

	public int getCantidad() {
		return cantidad;
	}

}
