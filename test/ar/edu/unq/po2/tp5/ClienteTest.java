package ar.edu.unq.po2.tp5;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.AssertionFailedError;

class ClienteTest {
	private Cliente cliente; 
	
	@BeforeEach
	public void setUp() {
		 cliente = new Cliente(1000);

	}

	@Test
	void testCliente() {
		assertEquals(Cliente.class, cliente.getClass());
	}

	@Test
	void testPagar() {
		cliente.pagar(200);
		assertEquals(800, cliente.getBilletera());
	}
	
	@Test
	void testErrorAlPagar() {
		cliente.pagar(5000);
	}

}
