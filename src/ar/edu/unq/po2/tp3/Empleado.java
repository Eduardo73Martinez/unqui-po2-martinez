package ar.edu.unq.po2.tp3;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Empleado extends Persona {

	private String apellido;
	DateFormat hoy = new SimpleDateFormat("yyyyMMddHHmmss");

	public Empleado(Date fechaNacimiento, String string, String apellido) {
		super(fechaNacimiento, string);
		this.apellido = apellido;
	} 

	public int edad() {
		Date hoy = new Date();
		return hoy.getYear() - this.getFechaNacimiento().getYear();
	}

}
