package ar.edu.unq.po2.tp3;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

class RectanguloTest {
	Rectangulo r1;
	Point p1 = new Point(10, 3);
	Point p2 = new Point(0,3);
	Point p3 = new Point(10,1);
	Point p4 = new Point(0,1);
	
	@BeforeEach
	void setUp() {
		 r1 = new Rectangulo();
		 r1.setP1(p1);
		 r1.setP2(p2);
		 r1.setP3(p3);
		 r1.setP4(p4);
	}


	@Test
	void testAlto() {
		r1.setP3(new Point(10,5));
		r1.setP4(new Point(0, 5));
		Assertions.assertEquals(r1.altura(), 3);
	}

	@Test
	void testAncho() {
		Assertions.assertEquals(r1.base(), 10);
	}

	@Test
	void testArea() {
		Assertions.assertEquals(50,50);
	}

	@Test
	void testPerimetro() {
		Assertions.assertEquals(50,50);
	} 

}
