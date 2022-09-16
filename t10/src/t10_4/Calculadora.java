package t10_4;

public class Calculadora {
	
	// Constructor 
	public Calculadora() {
	
	}
	
	// Metodo Suma
	public int suma(int num1, int num2) {
		return num1+num2;
	}
	// Metodo Resta
	public int resta(int num1, int num2) {
		return num1 - num2;
	}
	// Metodo Multiplicacion
	public int multiplicacion(int num1, int num2) {
		return num1 * num2;
	}
	// Metodo potencia
	public double potencia(int num1, int num2) {
		return Math.pow(num1, num2);
	}
	// Metodo raiz cuadrada
	public double raizCuadrada(int num) {
		return Math.sqrt(num);
	}
	// Metodo raiz cubica
	public double raizCubica(int num) {
		return Math.cbrt(num);
	}
	// Metodo division
	public double division(int num1,int num2) {
		return num1 / num2;
	}
}
