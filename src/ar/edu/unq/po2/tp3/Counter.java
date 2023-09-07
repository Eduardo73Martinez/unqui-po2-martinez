package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Counter {
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	public void agregarNumero(Integer numero) {
		this.numeros.add(numero);
	}

	public int cantidadDePares() {
		int cantidad = 0;
		for (Integer numeroActual : numeros) {
			cantidad = cantidad + this.unoSiEsPar(numeroActual);
		}
		return cantidad;

	}

	public int cantidadDeImPares() {
		int cantidad = 0;
		for (Integer numeroActual : numeros) {
			cantidad = cantidad + this.unoSiEsImpar(numeroActual);
		}
		return cantidad;

	}

	public int cantidadDeDivisoresPor(int divisor) {
		/**
		 * Se encarga de contar la cantidad de divisores por el parametro dado
		 * que se encuentran en el array de la clase.
		 */
		int cantidad = 0;
		for (Integer numeroActual : numeros) {
			cantidad = cantidad + this.unoSiEsDivisiblePor(numeroActual, divisor);
		}
		return cantidad;

	}

	/**
	 * las subtareas para cada una de las funciones
	 * 
	 * @param numero
	 * @return
	 */

	public int unoSiEsDivisiblePor(Integer numero, Integer numeroDivisor) {
		if (numero % numeroDivisor == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public Integer unoSiEsImpar(int numero) {
		if (numero % 2 != 0) {
			return 1;
		} else {
			return 0;
		}
	}

	public Integer unoSiEsPar(int numero) {
		if (numero % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}

	/**
	 * setters y getters
	 */

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}

	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}
}
