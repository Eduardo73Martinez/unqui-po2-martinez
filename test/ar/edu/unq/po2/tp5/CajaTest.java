package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CajaTest {
	private IProducto p1;
	private IProducto p2;
	private IProducto p3;
	private IProducto p4;
	private IProducto p5;
	private ArrayList<IProducto> array = new ArrayList();
	private Caja c;
	private Cliente cliente;

	@BeforeEach
	public void setUp() {
		p1 = new Producto(200, 10);
		p2 = new ProductoCooperativa(300, 2);
		p3 = new Producto(100, 4);
		p4 = new ProductoCooperativa(234, 5);
		p5 = new Producto(34, 3);
		array.add(p1);
		array.add(p2);
		array.add(p3);
		array.add(p4);
		array.add(p5);
		c = new Caja(array);
		cliente = mock(Cliente.class);

	}

	@Test
	void testRegistrarCompra() {
		IProducto p6 = new Producto(500, 6);
		c.registrarCompra(p6);
		assertEquals(1314.6, c.montoTotalAPagar());

	}

	@Test
	void testMontoTotalAPagar() {
		assertEquals(814.6, c.montoTotalAPagar());
	}

	@Test
	void testCobrarACliente() {
		// when(cliente.pagar()).thenReturn(200);
		c.cobrarACliente(cliente);

		verify(cliente).pagar(814.6);

	}

}
