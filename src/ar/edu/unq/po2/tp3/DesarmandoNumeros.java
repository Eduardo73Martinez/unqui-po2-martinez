package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmandoNumeros {

	public Integer numeroConMasDigitosPares(ArrayList<Integer> arrayNumeros) {
		Integer elQueTieneMasPares = null;
		for (Integer numeroActual : arrayNumeros) {
			elQueTieneMasPares = masParesEntre(numeroActual, elQueTieneMasPares);
		}
		return elQueTieneMasPares;

	}

	public Integer masParesEntre(Integer n1, Integer n2) {
		if (this.cantidadDePares(n1) > this.cantidadDePares(n2)) {
			return n1;
		} else {
			return n2;
		}
	}

	public Integer cantidadDePares(Integer numero) {
		int cantidadPares = 0;
		int divisor = 10 ^ this.cantidadDigitosDe(numero);
		int digitoActual = this.dividir_por(numero, divisor);
		int repetirVeces = this.cantidadDigitosDe(numero);

		while (repetirVeces != 0) {
			cantidadPares = cantidadPares + this.unoSiEsPar(digitoActual);
			divisor = 10 ^ (this.cantidadDigitosDe(numero) - 1);
			digitoActual = this.dividir_por(numero, divisor);
			repetirVeces--;
		}

		return cantidadPares;
	}

	public Integer cantidadDigitosDe(Integer num) {
		Integer digitos = 0;
		while (num >= 0) {
			num = num / 10;
			digitos++;
		}
		return digitos;
	}

	public int dividir_por(int n1, int n2) {
		return n1 / n2;
	}

	public Integer unoSiEsPar(int numero) {
		if (numero % 2 == 0) {
			return 1;
		} else {
			return 0;
		}
	}
}
