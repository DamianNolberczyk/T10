package t9_1;
public class Electrodomestico {
	//Constantes
	protected final static String COLOR_DEF="blanco";
	protected final static char CONSUMO_ENERGETICO_DEF='F';
	protected final static double PRECIO_BASE_DEF=100;
	protected final static double PESO_DEF=5;

	//Atributos
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;

	//Constructor por defecto
	public Electrodomestico() {
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.precioBase = PRECIO_BASE_DEF;
		this.peso = PESO_DEF;
	}

	// Constructores
	public Electrodomestico(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
	}
	// Constructores
	public Electrodomestico(double precio, double peso, char consumoEnergetico, String color) {
		this.precioBase=precio;
		this.peso=peso;
		comprobarConsumoEnergetico(consumoEnergetico);
		comprobarColor(color);

	}

	// Metodo para comprobar el consumo energetico
	public void comprobarConsumoEnergetico(char consumoEnergetico){

		if(consumoEnergetico>=65 && consumoEnergetico<=70){
			this.consumoEnergetico=consumoEnergetico;
		}else{
			this.consumoEnergetico=CONSUMO_ENERGETICO_DEF;
		}

	}

	// Metodo para comprobar el color
	private void comprobarColor(String color){

		//Colores disponibles
		String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
		boolean encontrado=false;

		for(int i=0;i<colores.length && !encontrado;i++){

			if(colores[i].equals(color)){
				encontrado=true;
			}

		}

		if(encontrado){
			this.color=color;
		}else{
			this.color=COLOR_DEF;
		}


	}
	// Precio final del electrodomestico
	public double precioFinal(){
		double plus=0;
		switch(consumoEnergetico){
		case 'A':
			plus+=100;
			break;
		case 'B':
			plus+=80;
			break;
		case 'C':
			plus+=60;
			break;
		case 'D':
			plus+=50;
			break;
		case 'E':
			plus+=30;
			break;
		case 'F':
			plus+=10;
			break;
		}

		if(peso>=0 && peso<19){
			plus+=10;
		}else if(peso>=20 && peso<49){
			plus+=50;
		}else if(peso>=50 && peso<=79){
			plus+=80;
		}else if(peso>=80){
			plus+=100;
		}

		return precioBase+plus;
	}


	// Getters y setters
	public double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}





}
