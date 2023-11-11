package ar.edu.unq.po2.tp9;

public class ServidorDigital implements Servidor {
	private String resultado;
	private String contrincantes;
	private String deporte;
	
	

	public ServidorDigital(String resultado, String contrincantes, String deporte) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
	}

	public String getResultado() {
		return resultado;
	}

	public String getContrincantes() {
		return contrincantes;
	}

	public String getDeporte() {
		return deporte;
	}

	@Override
	public void update(ServidorDigital p) {
		// TODO Auto-generated method stub
		
	}

}
