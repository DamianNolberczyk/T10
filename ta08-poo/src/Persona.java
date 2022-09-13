
public class Persona {
	// Atributos de la clase persona 
	private final static char sexoDef = 'H';
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;

	// Constructor por defecto
	public Persona() {
		this.sexo = sexoDef;
	}

	// Constructor con parametros por defecto
	public Persona(String nombre, int edad, char sexo){
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;

	}

	// Constructor con todos los atributos como parametros
	public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
		generarDni();
		this.sexo = sexo;
		comprobarSexo();
	}

	// Metodo de comprobar el sexo
	public void comprobarSexo(){

		// Si el usuario introduce 
		if (sexo != 'H' && sexo != 'M') {
			this.sexo = sexoDef;
		}	
	}

	// metodo para generarDNI
	private void generarDni() {
		final int divisor = 23;

		//Generamos un número de 8 digitos
		int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
		int res = numDNI - (numDNI / divisor * divisor);

		//Calculamos la letra del DNI
		char letraDNI = generaLetraDNI(res);

		//Pasamos el DNI a String
		dni = Integer.toString(numDNI) + letraDNI;
	}

	private char generaLetraDNI(int res) {
		char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
				'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
				'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

		return letras[res];
	}
	/*
	 * Metodo para comprobar si es mayor de edad
	 */
	public boolean esMayorDeEdad() {
		boolean mayor = false;
		if (edad >= 18) {
			mayor = true;
		}
		return mayor;
	}
	@Override
	public String toString() {
		return "------------" + 
				"\nNombre: " + this.nombre +
				"\nEdad: " + this.edad + 
				"\nDNI: " + this.dni + 
				"\nSexo: " + this.sexo + 
				"\nPeso: " + this.peso + 
				"\nAltura: " + this.altura;
	}

	// Setters y Getters

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public static char getSexodef() {
		return sexoDef;
	}

	public static void main(String[] args) {

		Persona persona1 = new Persona("Damian",20,'M');

		System.out.println(persona1);

	}



}
