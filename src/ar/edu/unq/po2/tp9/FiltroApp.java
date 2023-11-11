package ar.edu.unq.po2.tp9;

import java.util.ArrayList;

public class FiltroApp implements Servidor {
	
	private ArrayList<String> resultado;
	private ArrayList<String> contrincantes;
	private ArrayList<String> deporte;
	private ServidorDigital television;
	
	
	

	public FiltroApp(ArrayList<String> resultado, ArrayList<String> contrincantes, ArrayList<String> deporte,
			ServidorDigital television) {
		super();
		this.resultado = resultado;
		this.contrincantes = contrincantes;
		this.deporte = deporte;
		this.television = television;
	}

	@Override
	public void update(ServidorDigital p) {
		// TODO Auto-generated method stub
		if (this.esDeInteres(p)) {
			this.television.update(p);
		}
	}
	
	public boolean esDeInteres(ServidorDigital p) {
		return this.resultado.contains(p.getDeporte())||
				this.resultado.contains(p.getContrincantes())||
				this.resultado.contains(p.getResultado());
	}

}
