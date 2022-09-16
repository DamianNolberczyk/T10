package t10_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Creamos scanenr
		Scanner teclado = new Scanner(System.in);
		
		Calculadora claculadora = new Calculadora();
		
		// Preguntamos al usuario que quier hacer
		System.out.println("Escribe que quieras hacer: "
				+ "\n 1-suma, 2-resta, 3-multiplicacion"
				+ "\n 4-potencia, 5-raizcuadrada"
				+ "\n 6-raizcubica, 7-division");
		int selecion = teclado.nextInt();
		
		
		try {
			switch (selecion) {
			case 1: {
				// pregunto al usuario el primer numero
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				// pregunto al usuario el segundo numero
				System.out.println("Escribe el num2");
				int num2 = teclado.nextInt();
				// Mostrar el resultado 
				System.out.println(claculadora.suma(num1, num2)); 
				break;
			}
			case 2: {
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				
				System.out.println("Escribe el num2");
				int num2 = teclado.nextInt();
				System.out.println(claculadora.resta(num1, num2)); 
				break;
			}
			case 3: {
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				
				System.out.println("Escribe el num2");
				int num2 = teclado.nextInt();
				System.out.println(claculadora.multiplicacion(num1, num2)); 
				break;
			}
			case 4: {
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				
				System.out.println("Escribe el num2");
				int num2 = teclado.nextInt();
				System.out.println(claculadora.potencia(num1, num2)); 
				break;
			}
			case 5: {
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				System.out.println(claculadora.raizCuadrada(num1)); 
				break;
				
			} case 6: {
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				System.out.println(claculadora.raizCubica(num1)); 
				break;
			}
			case 7: {
				System.out.println("Escribe el num1");
				int num1 = teclado.nextInt();
				
				System.out.println("Escribe el num2");
				int num2 = teclado.nextInt();
				System.out.println(claculadora.division(num1, num2)); 
				break;
			}
			default:
			}
			
		} catch (Exception e) {
			 System.out.print(e);
		}

	}

}
