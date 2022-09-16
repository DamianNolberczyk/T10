package t10_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creamos Scanner
		Scanner teclado = new Scanner(System.in);
		// Genera un numero entre 1 y 500
		AdivinarNumero numAleatori = new AdivinarNumero();

		int numero = 0;
		do {
			System.out.println("Introduzca un numero (1-500)");
			try {
				// Sumar intento
				numAleatori.getContrador();
				numero = teclado.nextInt();

				numAleatori.comprobarNum(numero);
			} catch (InputMismatchException ex) {
				System.out.println("No ha introducido un numero entero");
				teclado.next();

			}

		} while (numero != numAleatori.getNumAleatorio());

		System.out.println("Enhorabuena. Has acertado, ya que el numero es: " + numAleatori.getNumAleatorio());
		System.out.println("Lo has conseguido tras todos estos intentos: " + numAleatori.getContrador());

	}

}


