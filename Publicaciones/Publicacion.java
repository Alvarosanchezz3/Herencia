package Publicaciones;

public abstract class Publicacion {
	protected String autor;
	protected String codigo;
	protected String titulo;
	protected int a�o;
	
	
	
	protected Publicacion(String autor, String codigo, String titulo, int a�o) {
		this.autor = autor;
		this.codigo = codigo;
		this.titulo = titulo;
		this.a�o = a�o;
		
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	
	
	
	
}
