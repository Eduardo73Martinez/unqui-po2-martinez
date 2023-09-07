package ar.edu.unq.po2.tp3;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTest {

	Counter contador1;

	@BeforeEach
	void setUp() {
		// se crea el contador
		contador1 = new Counter();

		// se agregan los numeros
		contador1.agregarNumero(1);
		contador1.agregarNumero(73);
		contador1.agregarNumero(3);
		contador1.agregarNumero(5);
		contador1.agregarNumero(7);
		contador1.agregarNumero(9);
		contador1.agregarNumero(1);
		contador1.agregarNumero(1);
		contador1.agregarNumero(1);
		contador1.agregarNumero(4);
	}

	@Test
	void testCantidadDePares() {
		Assert.assertEquals(contador1.cantidadDePares(), 1);
	}

	@Test
	void testCantidadDeImPares() {
		Assert.assertEquals(contador1.cantidadDeImPares(), 9);
	}

	@Test
	void testCantidadDeDivisoresPor() {
		Assert.assertEquals(contador1.cantidadDeDivisoresPor(3), 2);
	}

}
