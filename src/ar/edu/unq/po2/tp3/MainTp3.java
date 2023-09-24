package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class MainTp3 {
	static Multiplo m1 = new Multiplo();
	private static Point p1 = new Point();
	private static Point p2 = new Point(4, 3);
	private static Point p3 = new Point(10, 3);
	private static EquipoDeTrabajo e1;
	private static ArrayList<Empleado> a;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int  valor = m1.multiploMasGrande(3, 9);
//		System.out.print(valor);

		// eje 8
//		System.out.print("el valor de x: " + p1.getX() + " el valor de y:" + p1.getY() + "\n");
//		p1.mover(1, 2);
//		p2.sumar(p3);
//
//		System.out.print("el valor de x: " + p1.getX() + " el valor de y:" + p1.getY() + "\n");
//		System.out.print("el valor de x: " + p2.getX() + " el valor de y:" + p2.getY());
		DateFormat hoy = new SimpleDateFormat("yyyyMMddHHmmss");
        @SuppressWarnings("deprecation")
		Date date = new Date(1998,9,27,0, 0, 0);
        Date date2 = new Date(2007,8,28,0, 0, 0);
        Date date3 = new Date(2000,1,19,0, 0, 0);
        Date date4 = new Date(2002,4,27,0, 0, 0);
        Date date5 = new Date(1967,8,30,0, 0, 0);
   
        a= new ArrayList<Empleado>();
        a.add(new Empleado(date, "Eduardo", "Martinez") );
        a.add(new Empleado(date2, "franco", "Martinez") );
        a.add(new Empleado(date3, "Romina", "Martinez") );
        a.add(new Empleado(date4, "Daniela", "Martinez") );
        a.add(new Empleado(date5, "Rosa", "Martinez") );
        
        e1 = new EquipoDeTrabajo("Oracle company", a);
        
        System.out.println(date2.getYear());
	}

}
