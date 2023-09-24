package ar.edu.unq.po2.tp3;

import java.util.Date;

public class Persona {
	private Date fechaNacimiento;
	private String nombre;

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean menorQue(Persona p) {
		return this.getFechaNacimiento().after(p.getFechaNacimiento());
	}

	public Persona(Date fechaNacimiento, String nombre) {
		super();
		this.fechaNacimiento = fechaNacimiento;
		this.nombre = nombre;
	}

}
