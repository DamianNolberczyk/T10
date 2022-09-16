package t9_1;

public class Lavadora extends Electrodomestico {
	
	// Atributo
	private int carga;
	
	//Constantes
	protected final static int CARGA_DEF = 5;
	
	// Constructor por defecto
	public Lavadora() {
		this.carga = CARGA_DEF;
		this.precioBase = PRECIO_BASE_DEF;
		this.peso = PESO_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.color = COLOR_DEF;
	}
	
	// Constructor con 2 atributos percio y peso
	public Lavadora(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.carga = CARGA_DEF;
	}
	
	// Contrucotr con carga y atribuitos heredados
	public Lavadora(double precio, double peso, char consumoEnergetico, String color, int carga) {
		super(precio, peso, consumoEnergetico,color);
		this.carga = carga;
	}

	// Methodo get de Carga
	public int getCarga() {
		return carga;
	}

	// Methodo precioFinal
	public double precioFinal() {
		double plus=super.precioFinal();
		
		// Si carga superior a 30 sumamo 50
		if (carga > 30) {
			plus+= 50;
		}
		return plus;
	}
	
	
	
	
	
	
}
