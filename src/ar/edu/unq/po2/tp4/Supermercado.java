package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Supermercado {
	private String nombreSuper;
	private String location;
	private ArrayList<Producto> catalogo = new ArrayList<>();

	public Supermercado(String nombreSuper, String location) {
		super();
		this.nombreSuper = nombreSuper;
		this.location = location;
	}

	public Integer getCantidadDeProductos() {
		// TODO Auto-generated method stub
		return catalogo.size();
	}

	public void agregarProducto(Producto p) {
		// TODO Auto-generated method stub
		catalogo.add(p);
	}

	public Double getPrecioTotal() {
		// TODO Auto-generated method stub
		double total = 0;
		for (Producto p : catalogo) {
			total = total + p.getPrecio();
		}
		return total;
	}

}
