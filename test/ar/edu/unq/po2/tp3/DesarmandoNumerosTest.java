package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmandoNumerosTest {
	DesarmandoNumeros desarmador;
	ArrayList<Integer> array1=new ArrayList<>();

	@BeforeEach
	void setUp() {
		// se crea el contador
		desarmador = new DesarmandoNumeros();
		array1.add(1111);
		array1.add(222);
		array1.add(4444444);
		array1.add(434335);
		array1.add(88888888);
		array1.add(34);
		array1.add(222444);
		array1.add(3435);
		array1.add(344345);
		array1.add(3435);
	}

	@Test
	void testNumeroConMasDigitosPares() {
		Integer num = desarmador.numeroConMasDigitosPares(array1);
		assertEquals(88888888, num);
	}

	@Test
	void testMasParesEntre() {
		Integer num = desarmador.masParesEntre(222, 44444);
		assertEquals(44444, num);
	}

	@Test
	void testCantidadDePares() {
		Integer num = desarmador.cantidadDePares(4344523);
		assertEquals(4, num);
	}

	@Test
	void testCantidadDigitosDe() {
		Integer num = desarmador.cantidadDigitosDe(4344523);
		assertEquals(7, num);
	}

	@Test
	void testDividir_por() {
		Integer num  = desarmador.dividir_por(7234, 1000);
		assertEquals(7, num);
	}

	@Test
	void testUnoSiEsPar() {
		
	}

}
