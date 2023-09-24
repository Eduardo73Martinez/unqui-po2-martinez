package model.stack;

import model.Suma; // es necesario importar la clase!

public class Factorial {
	private Suma s = new Suma();
	
	public Integer factorialDe(int numero) {
		if(numero==0) {
			return 1;
		}
		else {
			return this.factorialDe(numero-1) ;
		}
	}
}
