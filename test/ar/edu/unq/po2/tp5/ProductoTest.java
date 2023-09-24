package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	IProducto p1;
	Producto p2;
	IProducto p3;
	IProducto p4;
	
	@BeforeEach
	public void setUp() {
		p1 = new Producto(100, 3);
		p2 = new Producto(0, 0);
		p3 = new ProductoCooperativa(1000, 0);
		p4 = new ProductoCooperativa(200, 3);
	}

	@Test
	void testProducto() {
		assertEquals(Producto.class,p1.getClass());
		assertEquals(Producto.class,p2.getClass());
		assertEquals(ProductoCooperativa.class,p3.getClass());
		assertEquals(ProductoCooperativa.class,p4.getClass());
	}

	@Test
	void testRegistrarPrecio() {
		assertEquals(100 , p1.registrarPrecio());
		assertEquals(0 , p2.registrarPrecio());
		assertEquals(900 , p3.registrarPrecio());
		assertEquals(180 , p4.registrarPrecio());
	}

	@Test
	void testDecrementarStock() {
		p2.decrementarStock();// debe dar error porque no tiene stock
	}

	@Test
	void testDescuento() {
		assertEquals(0, p1.descuento());
		assertEquals(0, p2.descuento());
		assertEquals(100, p3.descuento());
		assertEquals(20, p4.descuento());
	}

	@Test
	void testPrecioBase() {
		assertEquals(0, p1.descuento());
		assertEquals(0, p2.descuento());
		assertEquals(100, p3.descuento());
		assertEquals(20, p4.descuento());
	}

}
