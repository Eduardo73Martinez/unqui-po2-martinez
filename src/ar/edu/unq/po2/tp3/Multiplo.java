package ar.edu.unq.po2.tp3;

public class Multiplo {
	private int numeroInicial = 1000;

	public Integer multiploMasGrande(int x, int y) {
		int multiploActual = 1000;

		while (numeroInicial > 0 && !esMultiplo(multiploActual, x, y)) {
			multiploActual = numero_SiEsMultiploDe_Y_(numeroInicial, x, y);
			numeroInicial--;
		}
		return multiploActual;

	}

	public int numero_SiEsMultiploDe_Y_(int numero, int x, int y) {
		if (esMultiplo(numero, x, y)) {
			return numero;
		} else {
			return -1;
		}
	}

	private boolean esMultiplo(int numero, int x, int y) {
		return numero % x == 0 && numero % y == 0;
	}

}
