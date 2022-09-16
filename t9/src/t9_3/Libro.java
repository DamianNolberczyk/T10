package t9_3;

public class Libro {
	// Atributos 
	private int ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	
	// Constructor
    public Libro(int ISBN, String titulo, String autor, int numPaginas){
        
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numPaginas;
     
    }
	
	// Metodo get y set
	public int getISBN() {
		return ISBN;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getAutor() {
		return autor;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	
	// Metodo toString 
	public String toString() {
		return "El libro con " + ISBN + " creado por " + autor + " tiene " + numeroPaginas + " paginas";
	}
	
	
	
}
