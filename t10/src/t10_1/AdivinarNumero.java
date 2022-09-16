package t10_1;

public class AdivinarNumero {
	// Atributos
	private int numAleatorio = (int) (Math.random() * 500);
	private int contador;
	
	// Constructor
	public AdivinarNumero() {

	}
	
	// Metodo para comprobar el numero
	public void comprobarNum(int num) {
		if (num > numAleatorio) {
			System.out.println("El numero es menor. Sigue intentando");

		}
		if (num < numAleatorio) {
			System.out.println("El numero es mayor. Sigue intentandolo");
		}
		
	}
	

	// Getters y Setters
	public int getNumAleatorio() {
		return numAleatorio;
	}

	public int getContrador() {
		return contador++;
	}

	public void setNumAleatorio(int numAleatorio) {
		this.numAleatorio = numAleatorio;
	}

	public void setContrador(int contrador) {
		this.contador = contrador;
	}
	
	
	


       

}

