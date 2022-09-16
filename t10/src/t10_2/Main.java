package t10_2;

public class Main {

	public static void main(String[] args) {
		   try {
	            System.out.println("Mensaje mostrado por pantalla");
	            throw new MyException();
	        }
	        catch (MyException e) {
	            System.out.print(e);
	        }
	        finally {
	            System.out.println("\nPrograma terminado");
	        }

	}

}
