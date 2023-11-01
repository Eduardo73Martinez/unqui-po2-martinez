package ar.edu.unq.po2.tp7;

import java.util.List;
import java.util.Map;

public interface wikipediaPage {
	/**
	 * 
	 * @return Retorna el titulo de la pagina
	 */
	public String getTitle();

	/**
	 * 
	 * @return Retorna una Lista de las páginas de wikipedia con las que se conecta.
	 */

	public List<wikipediaPage> getLinks();

	/**
	 * 
	 * @return Retorna un Map con un valor texto y la pagina que describe ese valor
	 *         que aparecen en los infobox de la página de wikipedia
	 */
	public Map<String, wikipediaPage> getInfobox();

}
