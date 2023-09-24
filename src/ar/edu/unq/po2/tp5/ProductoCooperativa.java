package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {

	public ProductoCooperativa(double precio, int cantidad) {
		super(precio, cantidad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double descuento() {
		// TODO Auto-generated method stub
		return this.precioBase() * 0.10;
	}

}
