package ar.edu.unq.po2.tp7;

import java.util.List;

public interface Filtro {

	/**
	 * 
	 * @param page      es una pagina
	 * @param wikipedia es una lista de paginas
	 * @return una lista de paginas similares a la pagina dada
	 */
	public List<wikipediaPage> getSimilarPages(wikipediaPage page, List<wikipediaPage> wikipedia);
}
