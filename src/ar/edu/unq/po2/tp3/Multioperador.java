package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	ArrayList<Integer> array = new ArrayList<>();

	public ArrayList<Integer> getArray() {
		return array;
	}

	public void setArray(ArrayList<Integer> array) {
		this.array = array;
	}

	public void agregar(Integer n1) {
		this.array.add(n1);
	}

	public Integer sumarTodos() {
		int suma = 0;
		for (Integer num : array) {
			suma = suma + num;
		}
		return suma;
	}

	public Integer restarTodos() {
		int resta = 0;
		for (Integer num : array) {
			resta = resta - num;
		}
		return resta;
	}

	public Integer multiplicarTodos() {
		int mult = 0;
		for (Integer num : array) {
			mult = mult * num;
		}
		return mult;
	}

}
