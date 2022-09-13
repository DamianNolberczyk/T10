
public class Serie {

	//Constantes
	private final static int NUM_TEMPORADAS_DEF=3;
	private final static boolean ENTREGADO_DEF = false;

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








}
