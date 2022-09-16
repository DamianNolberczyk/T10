package t9_2;

public class Serie implements Entregable {

	//Constantes
	private final static int NUM_TEMPORADAS_DEF=3;
	private final static boolean ENTREGADO_DEF = false;
    public final static int MAYOR=1;
    public final static int MENOR=-1;
    public final static int IGUAL=0;

	//Atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;

	// Constructor por defecto
	public Serie() {
		this.numeroTemporadas = NUM_TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}

	// Constructor con 2 parametros
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.creador = creador;
		this.numeroTemporadas = NUM_TEMPORADAS_DEF;
		this.entregado = ENTREGADO_DEF;
	}

	// Constructor con 4 parameros
	public Serie(String titulo, int numeroTemporadas, String genero, String creador){
		this.titulo=titulo;
		this.numeroTemporadas=numeroTemporadas;
		this.genero=genero;
		this.creador=creador;
		this.entregado=ENTREGADO_DEF;
	}

	// Metodo get y set de los atributos excepto "entregado"
	public String getTitulo() {
		return titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public String getGenero() {
		return genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	public String toString() {
		 return "Informacion de la Serie: \n" +
	                "\tTitulo: "+titulo+"\n" +
	                "\tNumero de temporadas: "+numeroTemporadas+"\n" +
	                "\tGenero: "+genero+"\n" +
	                "\tCreador: "+creador;
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
	//Compara dos series segun su numero de temporadas
	 public int compareTo(Object a) {
	        int estado=MENOR;
	        //Hacemos un casting de objetos para usar el metodo get
	        Serie ref=(Serie)a;
	        if (numeroTemporadas>ref.getNumeroTemporadas()){
	            estado=MAYOR;
	        }else if(numeroTemporadas==ref.getNumeroTemporadas()){
	            estado=IGUAL;
	        }
	  
	        return estado;
	    }
	 //  Indica si dos Series son iguales, siendo el titulo y creador iguales
	  public boolean equals(Serie a){
	        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())){
	            return true;
	        }
	        return false;
	    }
	
	
}
