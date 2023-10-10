package ar.edu.unq.po2.tp6.Correccion;

public abstract class Cliente {
	private String nombreUsuario;
	private String passUsuario;
	private Servidor servidor;

	public Cliente(String nombreUsuario, String passUsuario, Servidor servidor) {
		super();
		this.nombreUsuario = nombreUsuario;
		this.passUsuario = passUsuario;
		this.servidor = servidor;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPassUsuario() {
		return passUsuario;
	}

	public Servidor getServidor() {
		return servidor;
	}

	abstract void conectar();

}
