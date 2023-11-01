package ar.edu.unq.po2.tp7;

import java.util.List;

public abstract class TipoFiltro implements Filtro {

	@Override
	public abstract List<wikipediaPage> getSimilarPages(wikipediaPage page, List<wikipediaPage> wikipedia);

	public List<wikipediaPage> getCoincidenciaEnTitulo(wikipediaPage page, List<wikipediaPage> wikipedia) {
		List<wikipediaPage> porTitulo = wikipedia.stream().filter(s -> s.getTitle().startsWith(page.getTitle()))
				.toList();
		return porTitulo;
	}

	public List<wikipediaPage> getCoincidenciaEnLink(wikipediaPage page, List<wikipediaPage> wikipedia) {
		List<wikipediaPage> porLink = wikipedia.stream().filter(s -> s.getLinks().contains(page.getLinks())).toList();
		return porLink;
	}

	public List<wikipediaPage> propiedadEnComun(wikipediaPage page, List<wikipediaPage> wikipedia) {
		List<wikipediaPage> propiedad = wikipedia.stream().filter(s -> s.getInfobox().containsKey(page.getInfobox()))
				.toList();
		return propiedad;
	}

	public List<wikipediaPage> otro(wikipediaPage page, List<wikipediaPage> wikipedia) {
		return null;

	}
}
