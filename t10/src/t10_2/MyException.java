package t10_2;

public class MyException extends Exception {
	String textException = "Esto es una Excepcion";
	
	public MyException() {
		super();
		System.out.println(textException);
	}
}
