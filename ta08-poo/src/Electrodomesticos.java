
public class Electrodomesticos {
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
	public Electrodomesticos() {
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
		this.precioBase = PRECIO_BASE_DEF;
		this.peso = PESO_DEF;
	}
	
	// Constructores
	public Electrodomesticos(double precio, double peso) {
		this.precioBase = precio;
		this.peso = peso;
		this.color = COLOR_DEF;
		this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
	}
	// Constructores
		public Electrodomesticos(double precio, double peso, String color, char consumoEnergetico) {
			this.precioBase = precio;
			this.peso = peso;
			comprobarColor(color);
			this.consumoEnergetico = consumoEnergetico;
		}
		//Métodos privados
		   
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
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
