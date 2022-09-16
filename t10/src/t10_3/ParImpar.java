package t10_3;

import java.util.Random;

public class ParImpar {
	private int numAleatorio;

	// Constructor
	public ParImpar() {
	
	}
	// Generar num aleatorio
	public int generarNum() {
		Random rnd = new Random();
		int num = rnd.nextInt(999);
		return num;
	}
	
	// Comporbarsi es par o impar
	public boolean comprobar(int num) {

		if (num % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
