package ar.edu.unq.po2.tp6.BancosYclientes;

public class Cliente implements ICliente{
	private String nombre;
	private String apellido;
	private int edad;
	private double sueldoNeto;
	private double cajaParaCredito;

	public double getCajaParaCredito() {
		return cajaParaCredito;
	}

	public void setCajaParaCredito(double cajaParaCredito) {
		this.cajaParaCredito = cajaParaCredito;
	}

	public double sueldoNetoAnual() {
		return this.sueldoNeto * 12;
	}

	public Cliente(String nombre, String apellido, int edad, double sueldoNeto) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.sueldoNeto = sueldoNeto;
	}

	public double getSueldoNeto() {
		return sueldoNeto;
	}

	public int getEdad() {
		return edad;
	}
	
	@Override
	public void solicitarCredito(Banco b, Solicitud s) {
		b.agregarSolicitud(this, s);
	}

}
