package model;

import model.stack.Factorial;// es necesario importar la clase para usar factorial!

public class Suma {
	int a;
	int b;
	private Factorial f = new Factorial();

	public int sumar() {
		return a + b;
	}
}
