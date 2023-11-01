package ar.edu.unq.po2.tp7;

import java.util.List;

public class LinkEnComun extends TipoFiltro {

	@Override
	public List<wikipediaPage> getSimilarPages(wikipediaPage page, List<wikipediaPage> wikipedia) {
		// TODO Auto-generated method stub
		return this.getCoincidenciaEnLink(page, wikipedia);
	}

}
