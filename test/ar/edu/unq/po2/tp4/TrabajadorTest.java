package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TrabajadorTest {
	private Ingreso i1 = new Ingreso(new Date(), "PAGO", 10000);
	private Ingreso i2 = new Ingreso(new Date(), "PAGO", 10000);
	private Ingreso i3 = new Ingreso(new Date(), "PAGO", 10000);
	private Ingreso i4 = new Ingreso(new Date(), "PAGO", 10000);
	private Ingreso i5 = new Ingreso(new Date(), "PAGO", 10000);
	private HorasExtra i6 = new HorasExtra(new Date(), "Horas extra", 10000, 10);
	private Trabajador m1;
	private ArrayList<Ingreso> is;

	@BeforeEach
	void setUp() {
		is= new ArrayList<>();
		is.add(i1);
		is.add(i2);
		is.add(i3);
		is.add(i4);
		is.add(i5);
		is.add(i6);
		m1 = new Trabajador("Eduardo", is);
	}

	@Test
	void testGetTotalPercibido() {
		assertEquals(7900*5 + 10000, m1.getTotalPercibido());
	}

	@Test
	void testGetMontoImponible() {
		assertEquals(2100*5 , m1.getMontoImponible());

	}

	@Test
	void testGetImpuestoAPagar() {
		assertEquals(2100 , m1.getImpuestoAPagar());
	}

}
