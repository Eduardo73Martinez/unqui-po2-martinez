package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IngresoTest {
	private Ingreso i1;
	
	@BeforeEach
	void setUp() {
		i1 = new Ingreso(new Date(), "PAGO", 10000);
	}

	@Test
	void testIngreso() {
		assertEquals(Ingreso.class, i1.getClass());
	}

	@Test
	void testGetMonto() {
		assertEquals(7900, i1.getMonto());
	}

	@Test
	void testSetMonto() {
		i1.setMonto(100);
		assertEquals(79,i1.getMonto());
	}

	@Test
	void testGetImpuesto() {
		assertEquals(2100, i1.getImpuesto());
	}

}
