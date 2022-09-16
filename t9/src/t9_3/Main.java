package t9_3;

public class Main {

	public static void main(String[] args) {
		
		// Crear objetos 
		Libro libro1 = new Libro(323482934, "Star wars Battlefront", "Goerge Lucas", 500);
		Libro libro2 = new Libro(823273434, "Don Kichote", "Miguel de Cervantes", 2000);
		
		// Mostra por pantalla
		System.out.println(libro1);
		System.out.println(libro2);
		
		// Si el libro 1 tiene mas paginas
		if (libro1.getNumeroPaginas() > libro2.getNumeroPaginas()) {
			// Mostramos un mensaje que libro 1 tiene mas paginas
			System.out.println("Libro 1 teiene mas paginas");
		} else {
			// En caso contrario el libro 2 tiene mas paginas
			System.out.println("Libro 2 teiene mas paginas");
		}
	}

}
