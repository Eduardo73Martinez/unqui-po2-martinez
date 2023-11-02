package ar.edu.unq.po2.tp7;

import javax.swing.DefaultListModel;

public class ListAdapter extends DefaultListModel {
	private ListaDePalabrasOrdenadas lista;

	public ListAdapter() {
		super();
		this.lista = new ListaDePalabrasOrdenadas();
	}
	
	
}
