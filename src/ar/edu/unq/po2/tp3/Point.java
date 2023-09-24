package ar.edu.unq.po2.tp3;

public class Point {
	private int x = 0;
	private int y = 0;

	/**
	 * constructores, usamos dos uno con parametros y otro que usa los valores de x
	 * e y por defecto (0,0)
	 */

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
	}

	/**
	 * Funcinalidad
	 */
	public void mover(int ejeX, int ejeY) {
		this.setX(this.getX() + ejeX);
		this.setY(this.getY() + ejeY);
	}

	public void sumar(Point p) {
		this.setX(this.getX() + p.getX());
		this.setY(this.getY() + p.getY());
	}

	/**
	 * setters y getters
	 * 
	 * @return
	 */
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
