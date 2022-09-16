package t9_1;

public class Television extends Electrodomestico {
	// Atributos
	private int resolucion;
	private boolean sintonizadorTDT;

	// Constante
	protected final static int RESOLUCION_DEF = 20;
	protected final static boolean SINTONIZADORTDT_DEF = false;

	// Constructor por defecto
	public Television() {
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = SINTONIZADORTDT_DEF;
		this.precioBase = PRECIO_BASE_DEF;
		this.peso = PESO_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.color = COLOR_DEF;
	}

	// Constructor con 2 atributos percio y peso
	public Television(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.resolucion = RESOLUCION_DEF;
		this.sintonizadorTDT = SINTONIZADORTDT_DEF;
	}

	// Contrucotr con resolucion y sintonizador y atribuitos heredados
	public Television(double precio, double peso, char consumoEnergetico, String color, int resolucion, boolean sintonizador) {
		super(precio, peso, consumoEnergetico,color);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizador;
	}

	// Metodo get
	public int getResolucion() {
		return resolucion;
	}

	public boolean isSintonizadorTDT() {
		return sintonizadorTDT;
	}

	// Metodo para calcular precioFinal
	public double precioFinal() {

		double plus=super.precioFinal();

		//Añadimos el codigo necesario
		if (resolucion>40){
			plus+=precioBase*0.3;
		}
		if (sintonizadorTDT){
			plus+=50;
		}

		return plus;
	}




}
