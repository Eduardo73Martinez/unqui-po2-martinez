package ar.edu.unq.po2.tp9;

import java.util.ArrayList;

public class Articulo {
	private String titulo; 
	private String autores;
	private String tipoArticulo;
	private String ubicacion;
	private ArrayList<String> palabrasClaves;
	
	public Articulo(String titulo, String autores, String ubicacion, ArrayList<String> palabrasClaves) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.ubicacion = ubicacion;
		this.palabrasClaves = palabrasClaves;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutores() {
		return autores;
	}

	public String getTipoArticulo() {
		return tipoArticulo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public ArrayList<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	
	
}
