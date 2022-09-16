package t10_3;

public class Main {

	public static void main(String[] args) {
		
		// Creamos el objeto
		ParImpar parimpar = new ParImpar();
		
		// Llamamos el metodo para generar num y lo guardaoms en la variable num
		int num = parimpar.generarNum();
		
		try {
			if (parimpar.comprobar(num)) {
				throw new Exception("El numero " + num + " Es par");
			} else {
				throw new Exception("El numero " + num + " Es impar");
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	

	}

}
