package ar.edu.unq.po2.tp3;

public class Rectangulo {
	private Point p1;
	private Point p2;
	private Point p3; // no tiene setter
	private Point p4; // no tiene setter

	public void setP3(Point p3) {
		if (p3.getX() != p1.getX()) {
			throw new Error("No tiene el mismo nivel que el primer punto");
		} else {
			this.p3 = p3;
		}
	}

	public void setP4(Point p4) {
		if (p2.getX() != p4.getX() || p4.getY() != p3.getY()) {
			throw new Error("Tiene distinto alto que el tercer punto o distinto ancho que el segundo");
		} else {
			this.p4 = p4;
		}
	}

	public double area() {
		return this.base() * this.altura();
	}

	public double perimetro() {
		return this.altura() * 2 + this.base() * 2;
	}

	public double altura() {
		// TODO Auto-generated method stub
		double x = this.getP1().getX() - this.getP3().getX();
		double y = this.getP1().getY() - this.getP3().getX();
		double discriminante = x * x - y * y;
		double raiz = Math.pow(discriminante, 1 / 2);
		return raiz;

	}

	public double base() {
		// TODO Auto-generated method stub
		double x = this.getP1().getX() - this.getP2().getX();
		double y = this.getP1().getY() - this.getP2().getX();
		double discriminante = x * x - y * y;
		double raiz = Math.pow(discriminante, 1 / 2);
		return raiz;
	}

	private void verticalUHorizontal() {
		if (this.base() > this.altura()) {
			System.out.print("Es un rectangulo horizontal");
		} else {
			System.out.print("Es un rectangulo vertical");
		}
	}

	/**
	 * setters y getters
	 * 
	 * @return
	 */

	public Point getP1() {
		return p1;
	}

	public Point getP3() {
		return p3;
	}

	public Point getP4() {
		return p4;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		if (p1.getY() != p2.getY()) {
			throw new Error("Tiene distinta altura que el primer punto");
		} else {
			this.p2 = p2;
		}
	}

}
