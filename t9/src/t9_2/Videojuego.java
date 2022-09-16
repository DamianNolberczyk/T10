package t9_2;

public class Videojuego implements Entregable{
	// Atributos
	private String titulo;
	private double horasEstimadas;
	private boolean entregado;
	private String genero;
	private String compania;

	// Constantes
	private static double HORASESTIMADAS_DEF = 10;
	private static boolean ENTREGADO = false;
    public final static int MAYOR=1;
    public final static int MENOR=-1;
    public final static int IGUAL=0;
	
    // Constructor por defecto
	public Videojuego() {
		this.horasEstimadas = HORASESTIMADAS_DEF;
		this.entregado = ENTREGADO;
	}

	// Constructor con 2 parametros
	public Videojuego(String titulo, double horas) {
		this.titulo = titulo;
		this.horasEstimadas = horas;
	}
	
	// Constructor con 4 parametros
	public Videojuego(String titulo, double horas, String genero, String compania) {
		this.titulo = titulo;
		this.horasEstimadas = horas;
		this.genero = genero;
		this.compania = compania;
	}
	

	public String getTitulo() {
		return titulo;
	}

	// Metodo get y set de los atributos excepto entregado
	public double getHorasEstimadas() {
		return horasEstimadas;
	}
	public String getGenero() {
		return genero;
	}
	public String getCompania() {
		return compania;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setHorasEstimadas(double horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCompania(String comapania) {
		this.compania = comapania;
	}

	public String toString() {
		return "Informacion del videojuego: \n" +
				"\tTitulo: "+titulo+"\n" +
				"\tHoras estimadas: "+horasEstimadas+"\n" +
				"\tGenero: "+genero+"\n" +
				"\tcompania: "+compania;
	}

	public void entegar() {
		entregado = true;

	}

	public void devolver() {
		entregado = false;

	}
	public boolean isEntregado() {
		if (entregado) {
			return true;
		} 
		return false;


	}
	// Compara dos videojuegos segun el numero de paginas
	 public int compareTo(Object a) {
	        int estado=MENOR;
	  
	        //Hacemos un casting de objetos para usar el metodo get
	        Videojuego ref=(Videojuego)a;
	        if (horasEstimadas>ref.getHorasEstimadas()){
	            estado=MAYOR;
	        }else if(horasEstimadas==ref.getHorasEstimadas()){
	            estado=IGUAL;
	        }
	  
	        return estado;
	    }
	 //Indica si dos videojuegos son iguales, siendo el titulo y compañia iguales
	 public boolean equals(Videojuego a){
	        if (titulo.equalsIgnoreCase(a.getTitulo()) && compania.equalsIgnoreCase(a.getCompania())){
	            return true;
	        }
	        return false;
	    }


}
