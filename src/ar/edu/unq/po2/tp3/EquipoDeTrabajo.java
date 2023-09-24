package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class EquipoDeTrabajo {
	private String Nombre;
	private ArrayList<Empleado> integrantes = new ArrayList<Empleado>();

	public String getNombre() {
		return Nombre;
	}
 
	public Integer promedioEdadEmpleados() {
		int totalEdad = 0;
		int cantidadEmpleados = 0;
		for (Empleado empleado : integrantes) {
			totalEdad = totalEdad + empleado.edad();
			cantidadEmpleados = cantidadEmpleados + 1;
		} 

		return totalEdad / cantidadEmpleados;
	}

	public EquipoDeTrabajo(String nombre, ArrayList<Empleado> integrantes) {
		super();
		Nombre = nombre;
		this.integrantes = integrantes;
	}

}
