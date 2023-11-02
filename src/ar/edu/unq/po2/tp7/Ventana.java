package ar.edu.unq.po2.tp7;

import java.awt.Rectangle;

import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;

public class Ventana extends JFrame {

	public Ventana(DefaultListModel<Object> defaultListModel) {
		this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));
		this.setBounds(new Rectangle(180, 180));
		this.setVisible(true);
		JLabel label = new JLabel("Lista de palabras");
		label.setBounds(new Rectangle(40, 40));
		this.add(label);
		defaultListModel.addElement("casa");
		defaultListModel.addElement("arbol");
		defaultListModel.addElement("perro");
		defaultListModel.addElement("telefono");
		defaultListModel.addElement("brazo");
		JList lista = new JList<Object>(defaultListModel);
		lista.setBounds(new Rectangle(110, 160));
		this.add(lista);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new Ventana(new DefaultListModel<Object>());
		//new Ventana(new ListaDePalabrasOrdenadas()); //no se puede instanciar!
		new Ventana(new ListAdapter()); // ListaDePalabrasOrdenadas esta adaptado en esta instancia
	}

}
