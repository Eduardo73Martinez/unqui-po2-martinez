package ar.edu.unq.po2.tp9;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SistemaBibliograficoTest {
	
	private SistemaBibliografico sistema = new SistemaBibliografico();;
	private FiltroInvestigador f1; 
	private FiltroInvestigador f2; 
	private FiltroInvestigador f3; 
	
	private Suscriptor s1;
	private Suscriptor s2;
	private Suscriptor s3; 
	
	//Articulo(String titulo, String autores, String ubicacion, ArrayList<String> palabrasClaves)
	
	private Articulo a1 = new Articulo("Fonetica 1", "Romina", "Bs As", null);
	private Articulo a2= new Articulo("Fonetica 2", "Romina", "Bs As", null);
	private Articulo a3 = new Articulo("Pendulo", "Erwin Schrödinger", "EEUU", null);
	private Articulo a4 = new Articulo("Mecanica clasica", "Edelstein", "Bs As", null);
	private Articulo a5 = new Articulo("Energia", "Feymann", "Francia", null);
	
	private ArrayList<String> lista1= new ArrayList();
	private ArrayList<String> lista2= new ArrayList();
	private ArrayList<String> lista3= new ArrayList();
	
	
	 
	@AfterEach 
	void setUp() {
		// primer array de tipo articulos
		lista1.add("Fisica");
		lista1.add("Atronomia");
		lista1.add("Informatica");
		
		// segundo array de titulos
		
		lista2.add("Pendulo simple"); 
		lista2.add("Mecanica cuantica"); 
		lista2.add("Energia"); 
		lista2.add("Torque"); 
		
		// tercer array de autores
		lista3.add("Feymann"); 
		lista3.add("Newton"); 
		lista3.add("Einstein"); 
		lista3.add("Erwin Schrödinger"); 
		
		s1 = mock(Suscriptor.class);
		s2 = mock(Suscriptor.class);
		s3 = mock(Suscriptor.class);
		
		
		f1 = new FiltroInvestigador(null, null,null, lista1, s1);
		f2 = new FiltroInvestigador(lista2, null,null, null, s2);
		f3 = new FiltroInvestigador(null, lista3,null, null, s3);
		
		
		
	}
	

	@Test
	void testSuscribir() {
		sistema.suscribir(f1); 
		Assertions.assertEquals(sistema.getSuscriptores().size(), 1);
	}



	@Test
	void testDesuscribir() {
		sistema.suscribir(f1); 
		sistema.suscribir(f2); 
		sistema.suscribir(f3); 
		sistema.desuscribir(f3); 
		Assertions.assertEquals(sistema.getSuscriptores().size(), 2);
	}

	@Test
	void testAgregarArticulo() {
		sistema.agregarArticulo(a1);
		Assertions.assertTrue(sistema.getBibliografia().contains(a1));
	}

	@Test
	void testNotificarSobre() {
		when(s3.notificacionRecidida(a3)).thenReturn(true);
		
		sistema.suscribir(f1); 
		sistema.suscribir(f2); 
		sistema.suscribir(f3); 
		
		sistema.agregarArticulo(a3);
		
		verify(s3, times(1) ).notificacionRecidida(a3);
	}

}
