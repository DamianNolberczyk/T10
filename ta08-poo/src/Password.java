
public class Password {
	//Constantes 
	private final static int LONG_DEF=8;

	// Atributos
	private int longitud = 8;
	private String contraseña;


	// Constructor por defecto
	public Password() {
		this(LONG_DEF);
	}

	// Constructor
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generaPassword();
	}

	// Metodo para generar la contraseny
	public String generaPassword (){
		String password="";
		for (int i=0;i<longitud;i++){
			//Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
			int eleccion=((int)Math.floor(Math.random()*3+1));

			if (eleccion==1){
				char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
				password+=minusculas;
			}else{
				if(eleccion==2){
					char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
					password+=mayusculas;
				}else{
					char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
					password+=numeros;
				}
			}
		}
		return password;
	}

	// Setters i Getters
	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrasena=" + contraseña + "]";
	}

	public static void main(String[] args) {

		Password contraseña = new Password(11);

		System.out.println(contraseña);

	}

}
